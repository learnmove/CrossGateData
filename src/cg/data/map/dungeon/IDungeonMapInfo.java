package cg.data.map.dungeon;

import java.io.BufferedWriter;
import java.io.File;
import java.util.List;
import java.util.Map;

import cg.data.map.MapInfo;
import cg.data.map.Warp;
import cg.data.sprite.NpcInfo;

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
	
	void setGoWarp(Warp warp, List<NpcInfo> npcInfoList);
	
	void setBackWarp(Warp warp, List<NpcInfo> npcInfoList);
	
	void output(BufferedWriter bw) throws Exception;
	
	void release(File maze);
	
	Map<Integer, int[]> create(int rate, T dungeon, boolean output, short enemyLevel);
	
	void createObject(Map<Integer, int[]> canUseCells, DungeonObstacle[] obstacles, T dungeon);
	
	void destroy() throws Exception;
	
	void setMapId(int mapId);

}
