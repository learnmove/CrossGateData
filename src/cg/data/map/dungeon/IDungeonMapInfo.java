package cg.data.map.dungeon;

import cg.data.map.MapInfo;

public interface IDungeonMapInfo extends MapInfo {
	
	void setMaxEast(int maxEast);
	
	void setMaxSouth(int maxSouth);
	
	void setCellImageGlobalIds(byte[] cellImageGlobalIds);
	
	void setObjectImageGlobalIds(byte[] objectImageGlobalIds);
	
	void setMarks(byte[] marks);
	
	byte getMark(GMSV_Dungeon dungeon, int mapEast, int mapSouth);
	
	int calcIndex(int east, int south);
	
	default int calcShortIndex(int east, int south) {
		return calcIndex(east, south) * DATA_LENGTH;
	}
	
	int getObjectId(int index);

}
