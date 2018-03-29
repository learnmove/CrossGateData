package cg.data.map.dungeon;

import com.google.common.collect.Range;

import cg.data.map.GameMap;
import cg.data.map.MapArea;

public interface Dungeon {
	
	String getName();
	
	int getMapId();
	
	DungeonData refresh(GameMap enterMap, GameMap exitMap);
	
	int getEncountId();
	
	Range<Byte> getEnemyRate();
	
	boolean getChangeDayState();
	
	Range<Short> getEnemyLevel();
	
	short getEnterMusic();
	
	short getExitMusic();
	
	byte getExitColorPalette();
	
	int getRefreshInterval();
	
	MapArea getEnterInfo();
	
	MapArea getExitInfo();
	
	void setAoiRange(int eastRange, int southRange);

}
