package cg.data.map.dungeon;

import static cg.base.map.MapCell.MARK_NOMARL;
import static cg.base.map.MapCell.MARK_NULL;
import static cg.base.map.MapCell.MARK_OBSTACLE;
import static cg.base.map.MapCell.MARK_WARP;
import static cg.base.util.MathUtil.bytesToInt2;
import static cg.base.util.MathUtil.divAddOne;
import static cg.base.util.MathUtil.getRandom;
import static cg.base.util.MathUtil.intToByte;
import static cg.data.map.dungeon.DungeonMapRegionInfo.OBSTACLE_COUNT_INDEX;
import static cg.data.map.dungeon.DungeonMapRegionInfo.OBSTACLE_EAST_INDEX;
import static cg.data.map.dungeon.DungeonMapRegionInfo.OBSTACLE_SOUTH_INDEX;
import static cg.data.sprite.NpcInfo.SPECIAL_NPC_ID_WARP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Table;

import cg.base.image.ImageDictionary;
import cg.base.reader.ImageReader;
import cg.data.map.Warp;
import cg.data.map.WarpManager;
import cg.data.sprite.NpcInfo;
import gnu.trove.map.TIntIntMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntIntHashMap;

public class DungeonMapInfo implements IDungeonMapInfo<GMSV_Dungeon> {
	
	private static final Logger log = LoggerFactory.getLogger(DungeonMapInfo.class);
	
	private static final byte[] XY = new byte[]{
		-1, -1, 
		0, -2, 
		1, -1, 
		-2, 0, 
		2, 0, 
		-1, 1, 
		0, 2, 
		1, 1
	};
	
	private int mapId, maxEast, maxSouth, goWarpId, backWarpId;
	
	private String name;
	
	private byte[] cellImageGlobalIds, objectImageGlobalIds, marks;
	
	private short enemyLevel;
	
	private FileInputStream fis;
	
	private final ImageReader imageReader;
	
	private final WarpManager warpManager;
	
	public DungeonMapInfo(ImageReader imageReader, WarpManager warpManager) {
		this.imageReader = imageReader;
		this.warpManager = warpManager;
	}

	@Override
	public int getMapId() {
		return mapId;
	}

	@Override
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
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
		return bytesToInt2(readBytes(calcShortIndex(east, south), DATA_LENGTH), 0, DATA_LENGTH);
	}
	
	private synchronized byte[] readBytes(int position, int size) {
		try {
			fis.getChannel().position(position);
		} catch (IOException e) {
			log.error("", e);
			return null;
		}
		byte[] datas = new byte[size];
		try {
			fis.read(datas);
			return datas;
		} catch (IOException e) {
			log.error("", e);
			return null;
		}
	}
	
	private int getImageGlobalId(int index) {
		return bytesToInt2(cellImageGlobalIds, index, DATA_LENGTH);
	}

	@Override
	public int getObjectId(int east, int south) {
		return bytesToInt2(readBytes(getMaxEast() * getMaxSouth() * DATA_LENGTH + calcShortIndex(east, south), DATA_LENGTH), 0, DATA_LENGTH);
	}
	
	@Override
	public int getObjectId(int index) {
		return bytesToInt2(objectImageGlobalIds, index, DATA_LENGTH);
	}

	@Override
	public byte getMark(int east, int south) {
		return marks[calcIndex(east, south)];
	}

	@Override
	public int getWarpId(int east, int south) {
		int index = calcIndex(east, south);
		return goWarpId == index ? goWarpId : backWarpId == index ? backWarpId : NO_WARP_ID;
	}

	@Override
	public void addWarp(Warp warp) {
		int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
		marks[key] = MARK_WARP;
		warpManager.addWarp(warp);
	}

	@Override
	public void setGoWarp(Warp warp, List<NpcInfo> npcInfoList) {
		goWarpId = warp.getId();
		addWarp(warp);
		setWarpResource(warp, npcInfoList);
	}

	@Override
	public void setBackWarp(Warp warp, List<NpcInfo> npcInfoList) {
		backWarpId = warp.getId();
		addWarp(warp);
		setWarpResource(warp, npcInfoList);
	}
	
	private void setWarpResource(Warp warp, List<NpcInfo> npcInfoList) {
		if (warp.getResourceGlobalId() >= 1 << 16) { // if global id more than 65535, create a NPC
			NpcInfo npcInfo = new NpcInfo(SPECIAL_NPC_ID_WARP);
			npcInfo.setCoordinates(new int[]{warp.getSourceMapEast(), warp.getSourceMapSouth(), getMapId()});
			npcInfo.setResourcesId(warp.getResourceGlobalId());
			npcInfoList.add(npcInfo);
		} else { // map image global id must less than 65536
			int key = calcIndex(warp.getSourceMapEast(), warp.getSourceMapSouth());
			intToByte(objectImageGlobalIds, key, DATA_LENGTH, warp.getResourceGlobalId());
		}
	}

	@Override
	public void output(BufferedWriter bw) throws Exception {
		for (int east = 0;east < maxEast;east++) {
			for (int south = 0;south < maxSouth;south++) {
//				int imageGlobalId = getImageGlobalId(east, south);
				int obstacleGloalIdId = getObjectId(calcShortIndex(east, south));
				byte mark = getMark(east, south);
//				bw.write(obstacleGloalIdId == 0 ? imageGlobalId == 0 ? "■" : "○" : "▲");
				bw.write(mark == MARK_OBSTACLE ? obstacleGloalIdId == 0 ? "■" : "?" : mark == MARK_NOMARL ? obstacleGloalIdId == 0 ? "○" : "*" : "▲");
			}
			bw.write("\r\n");
		}
	}

	@Override
	public void release(File maze) {
		try {
			File file = new File(maze, "" + System.currentTimeMillis());
			file.createNewFile();
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(cellImageGlobalIds);
			fos.write(objectImageGlobalIds);
			fos.flush();
			fos.close();
			
			cellImageGlobalIds = null;
			objectImageGlobalIds = null;
			
			fis = new FileInputStream(file);
		} catch (Exception e) {
			log.error("", e);
		}
	}

	@Override
	public TIntObjectMap<int[]> create(int rate, GMSV_Dungeon dungeon, boolean output, short enemyLevel) {
		this.enemyLevel = enemyLevel;
		return new DungeonMapInfoCreator(this).create(rate, dungeon, output);
	}
	
	public static DungeonMapRegion createRoom(int rate, DungeonMapRegionInfo dungeon, Table<Integer, Integer, DungeonMapRegion> mapRegions, int x, int y, Door parentDoor) {
		DungeonMapRegion mapRegion = new DungeonMapRegion(dungeon);
		mapRegion.setLocal(x, y);
		mapRegion.openDoor(rate, parentDoor);
		mapRegion.link(mapRegions);
		mapRegion.fit(mapRegions);
		mapRegions.put(x, y, mapRegion);
		return mapRegion;
	}
	
	@Override
	public byte getMark(GMSV_Dungeon dungeon, int mapEast, int mapSouth) {
		byte mark = dungeon.getMark(getObjectId(calcShortIndex(mapEast, mapSouth)));
		return mark == MARK_NULL ? getImageGlobalId(calcShortIndex(mapEast, mapSouth)) > 0 ? MARK_NOMARL : MARK_OBSTACLE : mark;
	}
	
	@Override
	public int calcIndex(int east, int south) {
		return south * getMaxEast() + east;
	}

	@Override
	public short getEnemyLevel() {
		return enemyLevel;
	}

	@Override
	public void createObject(TIntObjectMap<int[]> canUseCells, DungeonObstacle[] obstacles, GMSV_Dungeon dungeon) {
		for (DungeonObstacle obstacle : obstacles) { // for each all obstacle
			int rangeEast = obstacle.getRates()[OBSTACLE_EAST_INDEX], rangeSouth = obstacle.getRates()[OBSTACLE_SOUTH_INDEX];
			if (rangeSouth == 0 || rangeEast == 0) {
				continue;
			}
			int maxRow = divAddOne(maxSouth, rangeSouth), maxCol = divAddOne(maxEast, rangeEast);
			for (int col = 0;col < maxCol;col++) {
				for (int row = 0;row < maxRow;row++) {
					TIntIntMap cellMap = new TIntIntHashMap();
					addMapCell(rangeEast, rangeSouth, row, col, cellMap, canUseCells);
					
					byte obstacleCount = obstacle.getRates()[OBSTACLE_COUNT_INDEX];
					if (cellMap.size() > obstacleCount) { // the count of can use cell must more than obstacle's amount
						addObstale(obstacleCount, cellMap, canUseCells, dungeon, obstacle);
					}
				}
			}
		}
	}
	
	private void addMapCell(int rangeEast, int rangeSouth, int row, int col, TIntIntMap cellMap, TIntObjectMap<int[]> canUseCells) {
		int startEast = col * rangeEast, startSouth = row * rangeSouth; // calculate 
		for (int east = 0;east < rangeEast;east++) {
			for (int south = 0;south < rangeSouth;south++) {
				int key = calcIndex(startEast + east, startSouth + south);
				if (canUseCells.containsKey(key)) { // cache the cell which can use and in the obstacle range
					cellMap.put(key, key);
				}
			}
		}
	}
	
	private void addObstale(int obstacleCount, TIntIntMap cellMap, TIntObjectMap<int[]> canUseCells, GMSV_Dungeon dungeon, DungeonObstacle obstacle) {
		for (int i = 0;i < obstacleCount;i++) {
			int[] local = canUseCells.remove(cellMap.remove(cellMap.keys()[getRandom(cellMap.size())]));
			intToByte(objectImageGlobalIds, calcShortIndex(local[0], local[1]), DATA_LENGTH, obstacle.getImageGlobalId());
			byte mark = dungeon.getMark(obstacle.getImageGlobalId());
			marks[calcIndex(local[0], local[1])] = mark; // mark
			if (mark == MARK_OBSTACLE) { // when the obstacle do not support move, we need remove a cell which will close path
				for (byte dir = 0;dir < XY.length >> 1;dir++) {
					int key = calcIndex(local[0] + XY[dir << 1], local[1] + XY[(dir << 1) + 1]);
					if (cellMap.containsKey(key)) {
						canUseCells.remove(cellMap.remove(key));
					} else if (canUseCells.containsKey(key)) {
						canUseCells.remove(key);
					}
				}
			}
			
			if (cellMap.size() <= obstacleCount) {
				break;
			}
		}
	}

	@Override
	public void setObject(int east, int south, int resourceId) {
		ImageDictionary imageDictionary = imageReader.getImageDictionary(resourceId);
		if (imageDictionary != null) {
			intToByte(objectImageGlobalIds, calcShortIndex(east, south), DATA_LENGTH, resourceId);
			marks[calcIndex(east, south)] = imageDictionary.getMark();
		}
	}

	@Override
	public void destroy() throws Exception {
		fis.close();
	}

	@Override
	public void setMaxEast(int maxEast) {
		this.maxEast = maxEast;
	}

	@Override
	public void setMaxSouth(int maxSouth) {
		this.maxSouth = maxSouth;
	}

	@Override
	public void setCellImageGlobalIds(byte[] cellImageGlobalIds) {
		this.cellImageGlobalIds = cellImageGlobalIds;
	}

	@Override
	public void setObjectImageGlobalIds(byte[] objectImageGlobalIds) {
		this.objectImageGlobalIds = objectImageGlobalIds;
	}

	@Override
	public void setMarks(byte[] marks) {
		this.marks = marks;
	}

}
