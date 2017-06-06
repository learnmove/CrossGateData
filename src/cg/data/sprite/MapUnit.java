package cg.data.sprite;

import cg.base.io.message.interfaces.IVoUnit;
import cg.base.sprite.Unit;
import cg.base.util.Updatable;
import cg.data.map.GameMap;

public interface MapUnit extends Unit, Updatable {
	
	byte STATE_WAIT = 0;
	
	byte STATE_READY = 1;
	
	String VALUE_KEY_STATE = "state";
	
	short LEVEL_MAX = 160;
	
	enum MoveState {CREATE, REMOVE, MOVE};
	
	void move(GameMap map, int east, int south);
	
	GameMap getMap();
	
	void removeFromWorld();
	
	boolean getBeRemoved();
	
	void receiveMove(MapUnit unit, MoveState state);
	
	IVoUnit writeInfoVO();
	
	void removeFromMap();

}
