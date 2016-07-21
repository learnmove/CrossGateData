package cg.data.map.dungeon;

import static cg.base.map.MapCell.MARK_NOMARL;
import static cg.base.map.MapCell.MARK_OBSTACLE;
import static cg.data.map.MapInfo.DATA_LENGTH;
import static cg.data.map.dungeon.DungeonMapRegionInfo.ROOM_SIZE_EAST_MAX_INDEX;
import static cg.data.map.dungeon.DungeonMapRegionInfo.ROOM_SIZE_SOUTH_MAX_INDEX;
import static com.google.common.collect.Maps.newHashMap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Table;
import com.google.common.collect.TreeBasedTable;

class DungeonMapInfoCreator implements IDungeonMapInfoCreator<GMSV_Dungeon> {
	
	private static final Logger log = LoggerFactory.getLogger(DungeonMapInfoCreator.class);
	
	private final IDungeonMapInfo<GMSV_Dungeon> dungeonMapInfo;
	
	private GMSV_Dungeon dungeon;
	
	private Table<Integer, Integer, DungeonMapRegion> mapRegions;
	
	public DungeonMapInfoCreator(IDungeonMapInfo<GMSV_Dungeon> dungeonMapInfo) {
		this.dungeonMapInfo = dungeonMapInfo;
	}
	
	@Override
	public Map<Integer, int[]> create(int rate, GMSV_Dungeon dungeon, boolean output) {
		this.dungeon = dungeon;
		mapRegions = TreeBasedTable.create();
		DungeonMapRegion mapRegion = createRoom(rate, 0, 0, null);
		mapRegion.createSubRoom(mapRegions, this);
		Map<Integer, int[]> canUseCells = tileRoom();
		if (output) {
			try {
				output();
			} catch (Exception e) {
				log.error("", e);
			}
		}
		mapRegions.clear();
		return canUseCells;
	}

	@Override
	public DungeonMapRegion createRoom(int rate, int x, int y, Door parentDoor) {
		DungeonMapRegion mapRegion = new DungeonMapRegion(dungeon);
		mapRegion.setLocal(x, y);
		mapRegion.openDoor(rate, parentDoor);
		mapRegion.link(mapRegions);
		mapRegion.fit(mapRegions);
		mapRegions.put(x, y, mapRegion);
		return mapRegion;
	}
	
	private Map<Integer, int[]> tileRoom() {
		Set<Integer> keys = mapRegions.rowKeySet();
		// calculate the left column number(minCol), the right column number(maxCol), the top row number(minRow) and the bottom row number(maxRow)
		int index = 0, minCol = 0, maxCol = 0, minRow = 0, maxRow = 0;
		for (Integer key : keys) {
			if (index == 0) { // compare the left row number
				minCol = key;
			}
			if (index == keys.size() - 1) { // compare the right row number
				maxCol = key;
			}
			
			int rowIndex = 0;
			Set<Integer> rows = mapRegions.row(key).keySet();
			for (Integer row : rows) {
				if (rowIndex == 0 && minRow > row) { // compare the top row number
					minRow = row;
				}
				if (rowIndex == rows.size() - 1 && maxRow < row) { // compare the bottom row number
					maxRow = row;
				}
				rowIndex++;
			}
			
			index++;
		}
		return fill0(minCol, maxCol, minRow, maxRow);
	}
	
	private Map<Integer, int[]> fill0(int minCol, int maxCol, int minRow, int maxRow) {
		int col = maxCol - minCol + 1; // calculate amount of column
		int row = maxRow - minRow + 1; // calculate amount of row
		int maxSouth = col * dungeon.getSizeRange()[ROOM_SIZE_SOUTH_MAX_INDEX]; // calculate the max south
		int maxEast = row * dungeon.getSizeRange()[ROOM_SIZE_EAST_MAX_INDEX]; // calculate the max east
		dungeonMapInfo.setMaxSouth(maxSouth);
		dungeonMapInfo.setMaxEast(maxEast);
		int size = maxEast * maxSouth * DATA_LENGTH; // calculate size of data array
		byte[] cellImageGlobalIds = new byte[size];
		byte[] objectImageGlobalIds = new byte[size];
		byte[] marks = new byte[size / DATA_LENGTH];
		
		Map<Integer, int[]> canUseCells = newHashMap();
		int mapId = dungeonMapInfo.getMapId();
		int eastSize = dungeon.getSizeRange()[ROOM_SIZE_EAST_MAX_INDEX];
		int southSize = dungeon.getSizeRange()[ROOM_SIZE_SOUTH_MAX_INDEX];
		for (DungeonMapRegion mapRegion : mapRegions.values()) {
			mapRegion.fill();
			for (int regionEast = 0;regionEast < eastSize;regionEast++) {
				int mapEast = regionEast + (mapRegion.getY() - minRow) * eastSize; // calculate east of map
				for (int regionSouth = 0;regionSouth < southSize;regionSouth++) {
					int mapSouth = regionSouth + (mapRegion.getX() - minCol) * southSize; // calculate south of map
					int shortIndex = mapRegion.calcShortIndex(regionEast, regionSouth);
					for (int i = 0;i < DATA_LENGTH;i++) { // copy data from region to map
						int cellIndex = dungeonMapInfo.calcShortIndex(mapEast, mapSouth) + i;
						cellImageGlobalIds[cellIndex] = mapRegion.cellImageGlobalIds[shortIndex + i];
						int objectIndex = dungeonMapInfo.calcShortIndex(mapEast, mapSouth) + i;
						objectImageGlobalIds[objectIndex] = mapRegion.objectImageGlobalIds[shortIndex + i];
					}
					byte mark = dungeonMapInfo.getMark(dungeon, mapEast, mapSouth);
					marks[dungeonMapInfo.calcIndex(mapEast, mapSouth)] = mark; // mark
					if (mark == MARK_NOMARL) { // this is a can use cell
						canUseCells.put(dungeonMapInfo.calcIndex(mapEast, mapSouth), new int[]{mapEast, mapSouth, mapId});
					}
				}
			}
		}
		
		dungeonMapInfo.setCellImageGlobalIds(cellImageGlobalIds);
		dungeonMapInfo.setObjectImageGlobalIds(objectImageGlobalIds);
		dungeonMapInfo.setMarks(marks);
		return canUseCells;
	}
	
	private void output() throws Exception {
		File file = new File(getClass().getResource("/../../maze/" + System.currentTimeMillis() + ".txt").toURI());
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		for (DungeonMapRegion mapRegion : mapRegions.values()) {
			mapRegion.output(bw);
		}
		output(bw);
		bw.flush();
		bw.close();
	}
	
	public void output(BufferedWriter bw) throws Exception {
		for (int east = 0;east < dungeonMapInfo.getMaxEast();east++) {
			for (int south = 0;south < dungeonMapInfo.getMaxSouth();south++) {
//				int imageGlobalId = getImageGlobalId(east, south);
				int obstacleGloalIdId = dungeonMapInfo.getObjectId(dungeonMapInfo.calcShortIndex(east, south));
				byte mark = dungeonMapInfo.getMark(east, south);
//				bw.write(obstacleGloalIdId == 0 ? imageGlobalId == 0 ? "■" : "○" : "▲");
				bw.write(mark == MARK_OBSTACLE ? obstacleGloalIdId == 0 ? "■" : "?" : mark == MARK_NOMARL ? obstacleGloalIdId == 0 ? "○" : "*" : "▲");
			}
			bw.write("\r\n");
		}
	}

	@Override
	public GMSV_Dungeon getDungeon() {
		return dungeon;
	}

}
