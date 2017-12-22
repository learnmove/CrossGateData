package cg.data.gmsvReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cg.base.image.ImageDictionary;
import cg.base.map.MapCell;
import cg.base.reader.ImageReader;
import cg.base.util.IOUtils;
import cg.base.util.MathUtil;
import cg.data.loader.IDataPlatform;
import cg.data.map.MapInfo;
import cg.data.map.MapReader;
import cg.data.map.Warp;
import cg.data.map.WarpManager;
import gnu.trove.map.TIntIntMap;
import gnu.trove.map.hash.TIntIntHashMap;

public class CFileMapReader implements MapReader {
	
	private static final Logger log = LoggerFactory.getLogger(CFileMapReader.class);
	
	private final String pathName;
	
	private final IDataPlatform platform;
	
	public CFileMapReader(String pathName, IDataPlatform platform) {
		this.pathName = pathName;
		this.platform = platform;
	}

	@Override
	public MapInfo[] load() {
		File file = new File(platform.getClientFilePath());
		file = new File(file, pathName);
		File[] mapFiles = file.listFiles();
		MapInfo[] mapInfos = new MapInfo[mapFiles.length];
		for (int i = 0;i < mapFiles.length;i++) {
			try {
				mapInfos[i] = new FileMapInfo(mapFiles[i], platform.getWarpManager());
			} catch (IOException e) {
				log.error("", e);
			}
		}
		return mapInfos;
	}

	@Override
	public String getName() {
		return getClass().getName();
	}
	
	public class FileMapInfo implements MapInfo {
		
		public static final byte HEAD_LENGTH = 44;
		
		private final FileInputStream fis;
		
		private int mapId, maxEast, maxSouth;
		
		private String name;
		
		private byte[] marks;
		
		private TIntIntMap warpIds;
		
		public FileMapInfo(File file, WarpManager warpManager) throws IOException {
			String fileName = file.getName();
			String[] infos = fileName.split("_");
			try {
				mapId = Integer.parseInt(infos[0]);
			} catch (Exception e) {
				mapId = Integer.parseInt(infos[1]);
			}
			fis = new FileInputStream(file);
			warpIds = new TIntIntHashMap();
			
			readHead();
			readContent();
			analysis(warpManager.getWarps(mapId));
		}
		
		private void readHead() throws IOException {
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
			
			marks = new byte[getMaxEast() * getMaxSouth()];
			for (int i = 0;i < marks.length;i++) {
				marks[i] = MapCell.MARK_NOMARL;
			}
		}
		
		private void readContent() throws IOException {
			byte[] objectImageGlobalIds = readBytes(getMaxEast() * getMaxSouth() * DATA_LENGTH, getMaxEast() * getMaxSouth() * DATA_LENGTH);
			ImageReader imageReader = platform.getSourceData().getImageManager().getImageReader();
			for (int east = 0;east < maxEast;east++) {
				for (int south = 0;south < maxSouth;south++) {
					ImageDictionary imageDictionary = imageReader.getImageDictionary(MathUtil.bytesToInt2(objectImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH));
					if (imageDictionary != null) {
						setMark(imageDictionary, east, south, marks);
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
				Collection<Warp> values = warps.values();
				for (Warp warp : values) {
					int index = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
					marks[index] = MapCell.MARK_WARP;
					warpIds.put(index, warp.getId());
				}
			}
		}
		
		private int calcIndex(int east, int south) {
			return south * getMaxEast() + east;
		}
		
		private int calcShortIndex(int east, int south) {
			return calcIndex(east, south) << 1;
		}
		
		private synchronized byte[] readBytes(int position, int size) {
			try {
				fis.getChannel().position(HEAD_LENGTH + position);
				byte[] datas = new byte[size];
				fis.read(datas);
				return datas;
			} catch (IOException e) {
				log.error("", e);
				return null;
			}
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
			return east < 0 || east >= getMaxEast() || south < 0 || south >= getMaxSouth() ? 0 : MathUtil.bytesToInt2(readBytes(calcShortIndex(east, south), DATA_LENGTH), 0, DATA_LENGTH);
		}

		@Override
		public int getObjectId(int east, int south) {
			return east < 0 || east >= getMaxEast() || south < 0 || south >= getMaxSouth() ? 0 : MathUtil.bytesToInt2(readBytes(getMaxEast() * getMaxSouth() * DATA_LENGTH + calcShortIndex(east, south), DATA_LENGTH), 0, DATA_LENGTH);
		}

		@Override
		public byte getMark(int east, int south) {
			return east < 0 || east >= getMaxEast() || south < 0 || south >= getMaxSouth() ? 0 : marks[calcIndex(east, south)];
		}

		@Override
		public int getWarpId(int east, int south) {
			int key = calcIndex(east, south);
			return warpIds.containsKey(key) ? warpIds.get(key) : NO_WARP_ID;
		}

		@Override
		public void addWarp(Warp warp) {
			int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
			warpIds.put(key, warp.getId());
			marks[key] = MapCell.MARK_WARP;
			platform.getWarpManager().addWarp(warp);
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
		
		public int outputMarks(OutputStream os) throws IOException {
			os.write(marks);
			return marks.length;
		}
		
	}

}
