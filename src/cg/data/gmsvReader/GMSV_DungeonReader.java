package cg.data.gmsvReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tool.server.ioc.IOCBean;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.primitives.Ints;

import cg.base.conf.ConfDungeon;
import cg.base.conf.IConfDungeon;
import cg.base.image.ImageDictionary;
import cg.base.loader.IOCBeanType;
import cg.base.map.MapCell;
import cg.base.reader.ImageDictionaryReader;
import cg.base.util.MathUtil;
import cg.data.map.BaseMapArea;
import cg.data.map.GameMap;
import cg.data.map.LocalInfo;
import cg.data.map.MapArea;
import cg.data.map.Warp;
import cg.data.map.dungeon.Dungeon;
import cg.data.map.dungeon.DungeonData;
import cg.data.map.dungeon.DungeonMapInfo;
import cg.data.map.dungeon.DungeonObstacle;
import cg.data.map.dungeon.GMSV_Dungeon;
import cg.data.map.dungeon.IDungeonMapInfo;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.NpcInfo;
import cg.data.sprite.NpcTemplate;
import cg.data.util.FileUtils;
import cg.data.util.GameMapUtil;
import gnu.trove.map.TIntByteMap;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntByteHashMap;

@IOCBean(type=IOCBeanType.READER)
class GMSV_DungeonReader implements ObjectReader<Dungeon> {
	
	private static final Logger log = LoggerFactory.getLogger(GMSV_DungeonReader.class);
	
	private static final TIntByteMap marks = new TIntByteHashMap();
	
	private static int WARP_ID = -1;
	
	private final File maze;
	
	private ImageDictionaryReader reader;
	
	public GMSV_DungeonReader() {
		maze = new File("maze");
		FileUtils.deleteDir(maze);
		maze.mkdir();
	}

	@Override
	public List<Dungeon> read(ProjectData projectData) {
//		List<Dungeon> list = ObjectReader.transform(ConfDungeon.arrayFromExcel(projectData), s -> { return new CDungeon(s, maze); });
		List<Dungeon> list = Lists.transform(ConfDungeon.arrayFromText(projectData), this::createDungeon);
		marks.remove(0);
		reader = projectData.getImageManager().getImageDictionaryReader();
		for (int globalId : marks.keys()) {
			ImageDictionary imageDictionary = reader.getImageDictionary(globalId);
			if (imageDictionary != null) {
				marks.put(imageDictionary.getGlobalId(), imageDictionary.getMark());
			}
		}
		return list;
	}
	
	private static int makeWarpId() {
		return WARP_ID--;
	}
	
	Dungeon createDungeon(IConfDungeon s) {
		CDungeon ret = new CDungeon();
		ret.name = s.getName();
		ret.floorText = s.getFloorText()[0] + "{0}" + s.getFloorText()[1];
		ret.mapId = s.getMapId();
		ret.refreshInterval = s.getRefreshInterval();
		ret.enterInfo = new BaseMapArea(s.getEnterMapId(), s.getEnterMapWest(), s.getEnterMapNorth(), s.getEnterMapEast(), s.getEnterMapNorth());
		ret.exitInfo = new BaseMapArea(s.getExitMapId(), s.getExitMapWest(), s.getExitMapNorth(), s.getExitMapEast(), s.getExitMapNorth());
		ret.mapCellGlobalId = s.getMapCellGlobalId();
		ret.southWallGlobalId = s.getSouthWallGlobalId();
		MathUtil.mapAddArray(marks, ret.southWallGlobalId, (byte) 0);
		ret.eastWallGlobalId = s.getEastWallGlobalId();
		MathUtil.mapAddArray(marks, ret.eastWallGlobalId, (byte) 0);
		ret.cornerWallGlobalId = s.getCornerWallGlobalId();
		marks.put(ret.cornerWallGlobalId, (byte) 0);
		ret.warpResourceGlobalId = s.getWarpResourceGlobalId();
		MathUtil.mapAddArray(marks, ret.warpResourceGlobalId, (byte) 0);
		ret.floorRange = MathUtil.createRange(s.getFloorMin(), s.getFloorMax());
		ret.sizeRange = s.getSizeRange();
		ret.encountId = s.getEncountId();
		ret.enemyLevel = MathUtil.createRange(s.getEnemyLevelMin(), s.getEnemyLevelMax());
		ret.enemyRate = MathUtil.createRange(s.getEnemyRateMin(), s.getEnemyRateMax());
		ret.boxAmount = s.getBoxAmount();
		ret.enterMusic = s.getEnterMusic();
		ret.changeDayState = s.getChangeDayState();
		int[] imageGlobalIds = s.getImageGlobalIds();
		byte[] obstacleCounts = s.getObstacleCounts();
		byte[] obstacleEasts = s.getObstacleEasts();
		byte[] obstacleSouths = s.getObstacleSouths();
		ret.obstacles = new DungeonObstacle[imageGlobalIds.length];
		for (int i = 0;i < ret.obstacles.length;i++) {
			ret.obstacles[i] = new DungeonObstacle();
			ret.obstacles[i].load(imageGlobalIds[i], new byte[]{obstacleEasts[i], obstacleSouths[i], obstacleCounts[i]});
			marks.put(imageGlobalIds[i], (byte) 0);
		}
		int[] npcIds = s.getNpcIds();
		short[] refreshTimes = s.getRefreshTimes();
		List<NpcInfo> list = Lists.newArrayListWithCapacity(npcIds.length);
		for (int i = 0;i < npcIds.length;i++) {
			NpcInfo npcInfo = new NpcInfo(npcIds[i]);
			npcInfo.setRefreshTime(refreshTimes[i]);
			if (npcIds[i] > NpcTemplate.NPC_ID_NULL) {
				list.add(npcInfo);
			}
		}
		ret.npcInfos = list.toArray(new NpcInfo[list.size()]);
		ret.exitMusic = s.getExitMusic();
		ret.exitColorPalette = s.getExitColorPalette();
		return ret;
	}
	
	private class CDungeon implements GMSV_Dungeon {
		
		private static final byte CREATE_SUB_ROOM_RATE = 99;
		
		private String name, floorText;
		
		private int mapId, refreshInterval, mapCellGlobalId, cornerWallGlobalId, encountId, aoiEastRange, aoiSouthRange;
		
		private int[] southWallGlobalId, eastWallGlobalId, warpResourceGlobalId, sizeRange;
		
		private MapArea enterInfo, exitInfo;
		
		private Range<Byte> floorRange, enemyRate;
		
		private Range<Short> enemyLevel;
		
		private short boxAmount, enterMusic, exitMusic;
		
		private DungeonObstacle[] obstacles;
		
		private NpcInfo[] npcInfos;
		
		private byte exitColorPalette;
		
		private boolean changeDayState;

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public DungeonData refresh(GameMap enterMap, GameMap exitMap) {
			List<NpcInfo> npcInfoList = Lists.newLinkedList(); // cache the animation warp and box
			IDungeonMapInfo<GMSV_Dungeon>[] mapInfos = new DungeonMapInfo[MathUtil.getRandomInRangeByte(floorRange)];
			List<TIntObjectMap<int[]>> cellsList = Lists.newArrayListWithCapacity(mapInfos.length);
			int levelRange = enemyLevel.upperEndpoint() - enemyLevel.lowerEndpoint(), maxFloor = mapInfos.length;
			for (int floor = 0;floor < maxFloor;floor++) {
				mapInfos[floor] = new DungeonMapInfo(reader);
				mapInfos[floor].setMapId(mapId + (floor << 16));
				mapInfos[floor].setName(getName() + MessageFormat.format(floorText, floor + 1));
				TIntObjectMap<int[]> canUseCells = mapInfos[floor].create(CREATE_SUB_ROOM_RATE, this, false, (short) ((floor + 1) * levelRange / maxFloor + enemyLevel.lowerEndpoint()));
				cellsList.add(canUseCells);
				
				createWarp(floor, cellsList, mapInfos, enterMap, exitMap);
				mapInfos[floor].createObject(canUseCells, obstacles, this);
			}
//			int count = boxAmount;
//			for (NpcInfo npcInfo : npcInfos) {
//				count += npcInfo.getRefreshTime() <= 0 ? 1 : getRefreshInterval() / (npcInfo.getRefreshTime() * 1000);
//			}
			List<int[]> randomCellList = getRandomCellList(cellsList, boxAmount);
//			createNpc(randomCellList, npcInfoList);
			createBox(randomCellList, npcInfoList);
			
			for (IDungeonMapInfo<GMSV_Dungeon> mapInfo : mapInfos) {
				mapInfo.release(maze); // to out put a map file and free some array
			}
			
//			output(mapInfos);
			cellsList.clear();
			return new DungeonData(mapInfos, npcInfoList.toArray(new NpcTemplate[npcInfoList.size()]), aoiEastRange, aoiSouthRange, enterMap, exitMap);
		}

		@Override
		public int getEncountId() {
			return encountId;
		}
		
		@SuppressWarnings("unused")
		private void output(IDungeonMapInfo<GMSV_Dungeon>[] mapInfos) {
			File path = new File("maze/");
			if (!path.exists()) {
				path.mkdir();
			}
			for (IDungeonMapInfo<GMSV_Dungeon> mapInfo : mapInfos) {
				File file = new File(path, System.currentTimeMillis() + ".txt");
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(file));
					mapInfo.output(bw);
					bw.flush();
					bw.close();
				} catch (Exception e) {
					log.error("", e);
				}
			}
		}
		
//		private void createNpc(List<int[]> randomCellList, List<NpcInfo> npcInfoList) {
//			for (NpcInfo npcInfo : npcInfos) {
//				int count = npcInfo.getRefreshTime() <= 0 ? 1 : getRefreshInterval() / npcInfo.getRefreshTime(), coordinates[] = new int[count * 3];
//				for (int i = 0;i < count;i++) {
//					int[] local = randomCellList.remove(MathUtil.getRandom(randomCellList.size()));
//					coordinates[i * local.length] = local[0];
//					coordinates[i * local.length + 1] = local[1];
//					coordinates[i * local.length + 2] = local[2];
//				}
//				npcInfo.setCoordinates(coordinates);
//				npcInfoList.add(npcInfo);
//			}
//		}
		
		private void createBox(List<int[]> randomCellList, List<NpcInfo> npcInfoList) {
			for (int i = 0;i < boxAmount;i++) {
				NpcInfo npcInfo = new NpcInfo(NpcInfo.SPECIAL_NPC_ID_BOX);
				npcInfo.setCoordinates(randomCellList.remove(MathUtil.getRandom(randomCellList.size())));
				npcInfoList.add(npcInfo);
			}
		}
		
		private List<int[]> getRandomCellList(List<TIntObjectMap<int[]>> cellsList, int count) {
			int size = 0; // cache the cellsList's size
			for (TIntObjectMap<int[]> canUseCells : cellsList) {
				size += canUseCells.size(); // add size
			}
			List<int[]> list = Lists.newLinkedList();
			for (int i = 0;i < count;i++) {
				int rnd = MathUtil.getRandom(size--); // get a random number in [0, size), then size sub one
				for (TIntObjectMap<int[]> canUseCells : cellsList) {
					int index = rnd; // cache random number this time, if the random number less than canUseCells's size, it is this canUseCells's index
					if (rnd < canUseCells.size()) {
						canUseCells.keySet();
						list.add(canUseCells.remove(canUseCells.keys()[index])); // local box
						break;
					} else {
						rnd -= canUseCells.size();
					}
				}
			}
			return list;
		}
		
		private void createWarp(int floor, List<TIntObjectMap<int[]>> cellsList, IDungeonMapInfo<GMSV_Dungeon>[] mapInfos, GameMap enterMap, GameMap exitMap) {
			TIntObjectMap<int[]> canUseCells = cellsList.get(floor);
			List<Integer> canUseKeys = Ints.asList(canUseCells.keys());
			int[] local = canUseCells.remove(canUseKeys.remove(MathUtil.getRandom(canUseCells.size())));
			// create back warp and enter warp for each dungeon map
			int backMapId, east, south, resourceGlobalId;;
			Warp comeWarp;
			int mapId = mapInfos[floor].getMapId();
			if (floor == 0) { // The first map's come warp in a map which the enter info's map id.
				LocalInfo localInfo = GameMapUtil.getAEmptyLocal(enterMap.getMapInfo(), getEnterInfo());
				if (localInfo == null) {
					log.warn("The enter is obstacle.");
					return;
				}
				east = localInfo.getEast();
				south = localInfo.getSouth();
				comeWarp = Warp.createWarp(makeWarpId(), enterInfo.getMapId(), east, south, mapId, local[0], local[1], warpResourceGlobalId[ENTER_IN_RESOURCE_GLOBAL_ID_INDEX]);
				enterMap.addWarp(comeWarp);
				backMapId = enterInfo.getMapId();
				resourceGlobalId = warpResourceGlobalId[ENTER_OUT_RESOURCE_GLOBAL_ID_INDEX];
			} else { // If the map is not first map, the come warp must create in previous map.
				TIntObjectMap<int[]> map = cellsList.get(floor - 1);
				int[] backLocal = map.remove(Ints.asList(map.keys()).get(MathUtil.getRandom(map.size())));
				east = backLocal[0];
				south = backLocal[1];
				backMapId = mapInfos[floor - 1].getMapId();
				comeWarp = Warp.createWarp(makeWarpId(), backMapId, east, south, mapId, local[0], local[1], warpResourceGlobalId[NEXT_IN_RESOURCE_GLOBAL_ID_INDEX]);
				mapInfos[floor - 1].addWarp(comeWarp);
				resourceGlobalId = warpResourceGlobalId[NEXT_BACK_RESOURCE_GLOBAL_ID_INDEX];
				if (floor == mapInfos.length - 1 && enterInfo != null) { // the last map must create exit if it has, and players can not go back
					int[] exitLocal = canUseCells.remove(canUseKeys.remove(MathUtil.getRandom(canUseCells.size())));
					int exitEast = enterInfo.getEast(), exitSouth = exitInfo.getSouth();
					Warp exitWarp = Warp.createWarp(makeWarpId(), mapId, exitLocal[0], exitLocal[1], enterInfo.getMapId(), exitEast, exitSouth, warpResourceGlobalId[EXIT_OUT_RESOURCE_GLOBAL_ID_INDEX]);
					mapInfos[floor].addWarp(exitWarp);
				}
			}
			Warp backWarp = Warp.createWarp(makeWarpId(), mapId, local[0], local[1], backMapId, east, south, resourceGlobalId);
			mapInfos[floor].addWarp(backWarp);
		}

		@Override
		public Range<Byte> getEnemyRate() {
			return enemyRate;
		}

		@Override
		public boolean getChangeDayState() {
			return changeDayState;
		}

		@Override
		public Range<Short> getEnemyLevel() {
			return enemyLevel;
		}

		@Override
		public short getEnterMusic() {
			return enterMusic;
		}

		@Override
		public short getExitMusic() {
			return exitMusic;
		}

		@Override
		public byte getExitColorPalette() {
			return exitColorPalette;
		}

		@Override
		public int getRefreshInterval() {
			return refreshInterval * 1000;
		}

		@Override
		public int[] getSizeRange() {
			return sizeRange;
		}

		@Override
		public int[] getSouthWallGlobalId() {
			return southWallGlobalId;
		}

		@Override
		public int[] getEastWallGlobalId() {
			return eastWallGlobalId;
		}

		@Override
		public int getMapCellGlobalId() {
			return mapCellGlobalId;
		}

		@Override
		public int getCornerWallGlobalId() {
			return cornerWallGlobalId;
		}

		@Override
		public MapArea getEnterInfo() {
			return enterInfo;
		}

		@Override
		public MapArea getExitInfo() {
			return exitInfo;
		}

		@Override
		public void setAoiRange(int eastRange, int southRange) {
			aoiEastRange = eastRange;
			aoiSouthRange = southRange;
		}

		@Override
		public byte getMark(int imageGlobalId) {
			return marks.containsKey(imageGlobalId) ? marks.get(imageGlobalId) : MapCell.MARK_NULL;
		}
		
	}

	@Override
	public void output(File outFile, Collection<Dungeon> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
