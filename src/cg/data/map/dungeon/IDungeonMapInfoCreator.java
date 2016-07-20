package cg.data.map.dungeon;

import java.util.Map;

public interface IDungeonMapInfoCreator<T> {
	
	Map<Integer, int[]> create(int rate, GMSV_Dungeon dungeon, boolean output);
	
	DungeonMapRegion createRoom(int rate, int x, int y, Door parentDoor);
	
	T getDungeon();

}
