package cg.data.gmsvReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import cg.base.image.ImageDictionary;
import cg.base.map.MapCell;
import cg.base.reader.ImageDictionaryReader;
import cg.base.util.IOUtils;
import cg.base.util.MathUtil;
import cg.data.loader.IDataPlatform;
import cg.data.map.MapInfo;
import cg.data.map.Warp;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntObjectMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;

public class CFileMapReader implements ObjectReader<MapInfo> {
	
	private static final Logger log = LoggerFactory.getLogger(CFileMapReader.class);
	
	private final String pathName;
	
	private final IDataPlatform platform;
	
	public CFileMapReader(String pathName, IDataPlatform platform) {
		this.pathName = pathName;
		this.platform = platform;
	}

	@Override
	public List<MapInfo> read(ProjectData projectData) {
		// Load all warps.
		Table<Integer, Integer, Warp> warps = HashBasedTable.create();
		for (Warp warp : projectData.read(Warp.class)) {
			warps.put(warp.getSourceMapId(), warp.getId(), warp);
		}
		// Create all map info.
		File file = new File(new File(platform.getClientFilePath()), pathName);
		return ObjectReader.transform(file.listFiles(), input -> {
			try {
				return new FileMapInfo(input, warps);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});
	}
	
	private static interface ContentReader {
		
		void read(int east, int south, int content);
		
	}
	
	private class FileMapInfo implements MapInfo {
		
		public static final byte HEAD_LENGTH = 44;
		
		private int mapId, maxEast, maxSouth;
		
		private String name, fileName;
		
		private byte[] marks;
		
		private int[] globalIds, objectIds;
		
		private TIntObjectMap<Warp> warps, extraWarps = new TIntObjectHashMap<>();
		
		public FileMapInfo(File file, Table<Integer, Integer, Warp> warps) throws IOException {
			fileName = file.getName();
			String[] infos = fileName.split("_");
			try {
				mapId = Integer.parseInt(infos[0]);
			} catch (Exception e) {
				mapId = Integer.parseInt(infos[1]);
			}
			try (FileInputStream fis = new FileInputStream(file)) {
				readHead(fis);
				readContent(fis);
				analysis(warps.row(mapId));
			} catch (Exception e) {
				throw e;
			}
		}
		
		private void readHead(FileInputStream fis) throws IOException {
			byte[] datas = new byte[HEAD_LENGTH];
			fis.read(datas);
			byte[] bytes = new byte[6];
			for (int i = 0;i < bytes.length;i++) {
				bytes[i] = datas[i];
			}
			String head = new String(bytes);
			int index = 24;
			for (int i = 8;i < datas.length;i++) {
				if (datas[i] == 0) {
					index = i;
					break;
				}
			}
			bytes = new byte[index - 8];
			for (int i = 8;i < index;i++) {
				bytes[i - 8] = datas[i];
			}
//			unknowId = MathUtil.bytesToInt(datas, 6, 2); // unknowId
			if (head.equals(SERVER_HEAD)) {
				name = new String(bytes, IOUtils.GMSV_ENCODING);
			} else {
				name = new String(bytes, IOUtils.ENCODING);
			}
			maxEast = MathUtil.bytesToShort2(datas, 40);
			maxSouth = MathUtil.bytesToShort2(datas, 42);
			
			marks = new byte[maxEast * maxSouth];
			for (int i = 0;i < marks.length;i++) {
				marks[i] = MapCell.MARK_NOMARL;
			}
		}
		
		private void readContent(FileInputStream fis) throws IOException {
			int size = maxEast * maxSouth;
			globalIds = new int[size];
			objectIds = new int[size];
			readInt(fis, globalIds, null);
			ImageDictionaryReader reader = platform.getSourceData().getImageManager().getImageDictionaryReader();
			readInt(fis, objectIds, (east, south, id) -> {
				ImageDictionary imageDictionary = reader.getImageDictionary(id);
				if (imageDictionary != null) {
					setMark(imageDictionary, east, south, marks);
				}
			});
		}
		
		private void readInt(FileInputStream fis, int[] array, ContentReader reader) throws IOException {
			int index;
			byte[] datas = new byte[DATA_LENGTH];
			for (int east = 0;east < maxEast;east++) {
				for (int south = 0;south < maxSouth;south++) {
					index = calcIndex(east, south);
					fis.read(datas);
					array[index] = MathUtil.bytesToInt2(datas, 0, DATA_LENGTH);
					if (reader != null) {
						reader.read(east, south, array[index]);
					}
				}
			}
		}
		
		private void setMark(ImageDictionary imageDictionary, int startEast, int startSouth, byte[] marks) {
			for (int east = 0, useEast = imageDictionary.getUseEast();east < useEast;east++) {
				for (int south = 0, useSouth = imageDictionary.getUseSouth();south < useSouth;south++) {
					if (startEast >= east && startSouth >= south && startEast + east < getMaxEast()) {
						marks[calcIndex(startEast + east, startSouth - south)] = imageDictionary.getMark();
					}
				}
			}
		}
		
		private void analysis(Map<Integer, Warp> warps) {
			if (warps != null) {
				this.warps = new TIntObjectHashMap<>(warps.size());
				for (Warp warp : warps.values()) {
					int index = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
					marks[index] = MapCell.MARK_WARP;
					this.warps.put(index, warp);
				}
				this.warps = new TUnmodifiableIntObjectMap<>(this.warps);
			} else {
				this.warps = new TUnmodifiableIntObjectMap<>(new TIntObjectHashMap<>(0));
			}
		}
		
		private int calcIndex(int east, int south) {
			return south * getMaxEast() + east;
		}
		
		private int calcShortIndex(int east, int south) {
			return calcIndex(east, south) << 1;
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getMaxEast() {
			return maxEast;
		}

		@Override
		public int getMaxSouth() {
			return maxSouth;
		}

		@Override
		public int getImageGlobalId(int east, int south) {
			return east < 0 || east >= maxEast || south < 0 || south >= maxSouth ? 0 : globalIds[calcShortIndex(east, south)];
		}

		@Override
		public int getObjectId(int east, int south) {
			return east < 0 || east >= maxEast || south < 0 || south >= maxSouth ? 0 : objectIds[calcShortIndex(east, south)];
		}

		@Override
		public byte getMark(int east, int south) {
			return east < 0 || east >= maxEast || south < 0 || south >= maxSouth ? 0 : marks[calcIndex(east, south)];
		}

		@Override
		public void addWarp(Warp warp) {
			int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
			extraWarps.put(key, warp);
			marks[key] = MapCell.MARK_WARP;
		}

		@Override
		public short getEnemyLevel() {
			return NO_ENEMY_LEVEL;
		}

		@Deprecated
		@Override
		public void setObject(int east, int south, int resourceId) {
			log.warn("{}::setObject({}) : do not support this method.", getClass().getName(), resourceId);
		}

		@Override
		public String toString() {
			return MessageFormat.format("MapInfo[{0}] {1} {{2},{3}}.", getMapId(), getName(), getMaxEast(), getMaxSouth());
		}

		@Override
		public String getFileName() {
			return fileName;
		}

		@Override
		public Warp getWarp(int east, int south) {
			int key = calcIndex(east, south);
			return warps.containsKey(key) ? warps.get(key) : extraWarps.get(key);
		}
		
	}

	@Override
	public void output(File outFile, Collection<MapInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
