package cg.data.map.dungeon;

import gnu.trove.map.TIntObjectMap;

public interface IDungeonMapInfoCreator<T> {
	
	TIntObjectMap<int[]> create(int rate, GMSV_Dungeon dungeon, boolean output);
	
	DungeonMapRegion createRoom(int rate, int x, int y, Door parentDoor);
	
	T getDungeon();

}
