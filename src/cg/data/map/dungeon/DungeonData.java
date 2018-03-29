package cg.data.map.dungeon;

import java.io.File;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.Lists;

import cg.base.map.MapCell;
import cg.base.util.MathUtil;
import cg.data.map.GameMap;
import cg.data.map.MapInfo;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.NpcTemplate;

public class DungeonData implements ObjectReader<MapInfo> {
	
	public static final byte LOCAL_INDEX_MAP_ID = 0;
	
	public static final byte LOCAL_INDEX_EAST = 1;
	
	public static final byte LOCAL_INDEX_SOUTH = 2;
	
	private final List<MapInfo> mapInfos;
	
	private final NpcTemplate[] npcTemplates;
	
	private final int aoiEastRange, aoiSouthRange;
	
	private final GameMap enterMap, exitMap;
	
	public DungeonData(MapInfo[] mapInfos, NpcTemplate[] npcTemplates, int eastRange, int southRange, GameMap enterMap, GameMap exitMap) {
		this.npcTemplates = npcTemplates;
		this.mapInfos = Lists.newArrayList(mapInfos);
		aoiEastRange = eastRange;
		aoiSouthRange = southRange;
		this.enterMap = enterMap;
		this.exitMap = exitMap;
	}

	public NpcTemplate[] getNpcTemplates() {
		return npcTemplates;
	}
	
	public int getAoiEastRange() {
		return aoiEastRange;
	}
	
	public int getAoiSouthRange() {
		return aoiSouthRange;
	}
	
	public GameMap getEnterMap() {
		return enterMap;
	}
	
	public GameMap getExitMap() {
		return exitMap;
	}
	
	public int[][] getCanUseLocals(int count) {
		List<int[]> list = Lists.newLinkedList();
		for (MapInfo mapInfo : mapInfos) {
			for (int east = 0;east < mapInfo.getMaxEast();east++) {
				for (int south = 0;south < mapInfo.getMaxSouth();south++) {
					if (mapInfo.getMark(east, south) == MapCell.MARK_NOMARL) {
						list.add(new int[]{mapInfo.getMapId(), east, south});
					}
				}
			}
		}
		
		if (count > list.size()) {
			throw new IllegalArgumentException(getClass().getName() + "::getCanUseCells() : count more than can use cell amount.");
		} else {
			int[][] array = new int[count][];
			for (int i = 0;i < count;i++) {
				array[i] = list.remove(MathUtil.getRandom(list.size()));
			}
			return array;
		}
	}

	@Override
	public List<MapInfo> read(ProjectData projectData) {
		return mapInfos;
	}

	@Override
	public void output(File outFile, Collection<MapInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
