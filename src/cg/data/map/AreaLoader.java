package cg.data.map;

import java.util.List;

import cg.base.io.message.interfaces.IVoMapCell;

public interface AreaLoader {
	
	void writeInfo(int west, int east, int north, int south, List<IVoMapCell> mapCells, MapInfo mapInfo) throws Exception;

}
