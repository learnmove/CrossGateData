package cg.data.map.dungeon;

import java.io.BufferedWriter;
import java.io.File;

import cg.data.map.MapInfo;
import gnu.trove.map.TIntObjectMap;

public interface IDungeonMapInfo<T> extends MapInfo {
	
	void setMaxEast(int maxEast);
	
	void setMaxSouth(int maxSouth);
	
	void setCellImageGlobalIds(byte[] cellImageGlobalIds);
	
	void setObjectImageGlobalIds(byte[] objectImageGlobalIds);
	
	void setMarks(byte[] marks);
	
	byte getMark(T dungeon, int mapEast, int mapSouth);
	
	int calcIndex(int east, int south);
	
	default int calcShortIndex(int east, int south) {
		return calcIndex(east, south) * DATA_LENGTH;
	}
	
	int getObjectId(int index);
	
	void setName(String name);
	
	void output(BufferedWriter bw) throws Exception;
	
	void release(File maze);
	
	TIntObjectMap<int[]> create(int rate, T dungeon, boolean output, short enemyLevel);
	
	void createObject(TIntObjectMap<int[]> canUseCells, DungeonObstacle[] obstacles, T dungeon);
	
	void destroy() throws Exception;
	
	void setMapId(int mapId);

}
