package cg.data.gmsvReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.MessageFormat;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.primitives.Ints;

import cg.base.image.ImageDictionary;
import cg.base.image.ImageReader;
import cg.base.map.MapCell;
import cg.base.util.MathUtil;
import cg.data.map.GameMap;
import cg.data.map.LocalInfo;
import cg.data.map.MapArea;
import cg.data.map.ReaderMapArea;
import cg.data.map.Warp;
import cg.data.map.WarpManager;
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

public class GMSV_DungeonReader implements ObjectReader<Dungeon> {
	
	private static final Logger log = LoggerFactory.getLogger(GMSV_DungeonReader.class);
	
	private static final TIntByteMap marks = new TIntByteHashMap();
	
	private static int WARP_ID = -1;
	
	private ImageReader imageReader;
	
	private final File maze;
	
	public GMSV_DungeonReader() {
		maze = new File("maze");
		FileUtils.deleteDir(maze);
		maze.mkdir();
	}

	@Override
	public List<Dungeon> read(ProjectData projectData) {
		imageReader = projectData.getImageManager().getImageReader();
		String[] lines = projectData.getTextResource("dungeonconf");
		List<Dungeon> list = Lists.newArrayListWithCapacity(lines.length);
		for (String line : lines) {
			list.add(new CDungeon(line, maze));
		}
		marks.remove(0);
		ImageDictionary[] imageDictionaries = imageReader.getImageDictionaries(marks.keys());
		for (int i = 0;i < imageDictionaries.length;i++) {
			if (imageDictionaries[i] != null) {
				marks.put(imageDictionaries[i].getGlobalId(), imageDictionaries[i].getMark());
			}
		}
		return list;
	}
	
	private static int makeWarpId() {
		return WARP_ID--;
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
		
		private final File maze;
		
		public CDungeon(String line, File maze) {
			this.maze = maze;
			String[] infos = line.split("\t");
			name = infos[0];
			floorText = infos[1] + "{0}" + infos[2];
			mapId = Integer.parseInt(infos[3]);
			// 4, 5, 6
			refreshInterval = Integer.parseInt(infos[7]);
			enterInfo = new ReaderMapArea(infos, 9);
			exitInfo = new ReaderMapArea(infos, 15);
			mapCellGlobalId = Integer.parseInt(infos[22]);
			// 23, 24
			southWallGlobalId = new int[]{Integer.parseInt(infos[25]), Integer.parseInt(infos[26])};
			eastWallGlobalId = new int[]{Integer.parseInt(infos[27]), Integer.parseInt(infos[28])};
			cornerWallGlobalId = Integer.parseInt(infos[29]);
			warpResourceGlobalId = new int[]{Integer.parseInt(infos[30]), Integer.parseInt(infos[31]), Integer.parseInt(infos[32]), Integer.parseInt(infos[33]), 
					Integer.parseInt(infos[34]), Integer.parseInt(infos[35]), Integer.parseInt(infos[36]), Integer.parseInt(infos[37])};
			// 38
			floorRange = Range.closed(Byte.valueOf(infos[39]), Byte.valueOf(infos[40]));
			sizeRange = new int[]{Integer.parseInt(infos[41]), Integer.parseInt(infos[42]), Integer.parseInt(infos[43]), Integer.parseInt(infos[44]), 
					Integer.parseInt(infos[45]), Integer.parseInt(infos[46]), Integer.parseInt(infos[47]), Integer.parseInt(infos[48])};
			encountId = Integer.parseInt(infos[49]);
			enemyLevel = Range.closed(Short.valueOf(infos[50]), Short.valueOf(infos[51]));
			enemyRate = MathUtil.createRange(Byte.valueOf(infos[52]), Byte.valueOf(infos[53]));
			boxAmount = Short.parseShort(infos[54]);
			enterMusic = Short.parseShort(infos[55]);
			changeDayState = infos[56].equals("1");
			obstacles = new DungeonObstacle[10];
			
			MathUtil.mapAddArray(marks, eastWallGlobalId, (byte) 0);
			MathUtil.mapAddArray(marks, southWallGlobalId, (byte) 0);
			marks.put(cornerWallGlobalId, (byte) 0);
			MathUtil.mapAddArray(marks, warpResourceGlobalId, (byte) 0);
			
			for (int i = 0;i < obstacles.length;i++) {
				obstacles[i] = new DungeonObstacle();
				obstacles[i].load(infos, i);
				marks.put(obstacles[i].getImageGlobalId(), (byte) 0);
			}
			// 97, 98, 99, 100
			int count = 8;
			List<NpcInfo> list = Lists.newArrayListWithCapacity(count);
			for (int i = 0;i < count;i++) {
				NpcInfo npcInfo = new NpcInfo(MathUtil.stringToInt(infos[101 + i * 2]));
				npcInfo.setRefreshTime(MathUtil.stringToShort(infos[102 + i * 2]));
				if (npcInfo.getId() > NpcTemplate.NPC_ID_NULL) {
					list.add(npcInfo);
				}
			}
			npcInfos = new NpcInfo[list.size()];
			list.toArray(npcInfos);
			exitMusic = MathUtil.stringToShort(infos[117]);
			exitColorPalette = MathUtil.stringToByte(infos[118]);
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getMapId() {
			return mapId;
		}

		@Override
		public DungeonData refresh(WarpManager warpManager, GameMap enterMap, GameMap exitMap) {
			List<NpcInfo> npcInfoList = Lists.newLinkedList(); // cache the animation warp and box
			IDungeonMapInfo<GMSV_Dungeon>[] mapInfos = new DungeonMapInfo[MathUtil.getRandomInRangeByte(floorRange)];
			List<TIntObjectMap<int[]>> cellsList = Lists.newArrayListWithCapacity(mapInfos.length);
			int levelRange = enemyLevel.upperEndpoint() - enemyLevel.lowerEndpoint(), maxFloor = mapInfos.length;
			for (int floor = 0;floor < maxFloor;floor++) {
				mapInfos[floor] = new DungeonMapInfo(imageReader, warpManager);
				mapInfos[floor].setMapId(mapId + (floor << 16));
				mapInfos[floor].setName(getName() + MessageFormat.format(floorText, floor + 1));
				TIntObjectMap<int[]> canUseCells = mapInfos[floor].create(CREATE_SUB_ROOM_RATE, this, false, (short) ((floor + 1) * levelRange / maxFloor + enemyLevel.lowerEndpoint()));
				cellsList.add(canUseCells);
				
				createWarp(floor, cellsList, warpManager, mapInfos, npcInfoList, enterMap, exitMap);
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
			return new DungeonData(mapInfos, npcInfoList.toArray(new NpcTemplate[npcInfoList.size()]), aoiEastRange, aoiSouthRange, enterMap, exitMap, getName());
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
		
		private void createWarp(int floor, List<TIntObjectMap<int[]>> cellsList, WarpManager warpManager, IDungeonMapInfo<GMSV_Dungeon>[] mapInfos, List<NpcInfo> npcInfoList, GameMap enterMap, GameMap exitMap) {
			TIntObjectMap<int[]> canUseCells = cellsList.get(floor);
			List<Integer> canUseKeys = Ints.asList(canUseCells.keys());
			int[] local = canUseCells.remove(canUseKeys.remove(MathUtil.getRandom(canUseCells.size())));
			// create back warp and enter warp for each dungeon map
			int backMapId, east, south, resourceGlobalId;;
			Warp comeWarp;
			int mapId = mapInfos[floor].getMapId();
			if (floor == 0) { // the first map's come warp in a map which the enter info's map id
				LocalInfo localInfo = GameMapUtil.getAEmptyLocal(enterMap.getMapInfo(), getEnterInfo());
				if (localInfo == null) {
					log.warn("The enter is obstacle.");
					return;
				}
				east = localInfo.getEast();
				south = localInfo.getSouth();
				comeWarp = CWarpReader.createWarp(makeWarpId(), enterInfo.getMapId(), east, south, mapId, local[0], local[1], warpResourceGlobalId[ENTER_IN_RESOURCE_GLOBAL_ID_INDEX]);
				enterMap.addWarp(comeWarp);
				backMapId = enterInfo.getMapId();
				resourceGlobalId = warpResourceGlobalId[ENTER_OUT_RESOURCE_GLOBAL_ID_INDEX];
			} else { // if the map is not first map, the come warp must create in previous map
				TIntObjectMap<int[]> map = cellsList.get(floor - 1);
				int[] backLocal = map.remove(Ints.asList(map.keys()).get(MathUtil.getRandom(map.size())));
				east = backLocal[0];
				south = backLocal[1];
				backMapId = mapInfos[floor - 1].getMapId();
				comeWarp = CWarpReader.createWarp(makeWarpId(), backMapId, east, south, mapId, local[0], local[1], warpResourceGlobalId[NEXT_IN_RESOURCE_GLOBAL_ID_INDEX]);
				mapInfos[floor - 1].setGoWarp(comeWarp, npcInfoList);
				resourceGlobalId = warpResourceGlobalId[NEXT_BACK_RESOURCE_GLOBAL_ID_INDEX];
				if (floor == mapInfos.length - 1 && enterInfo != null) { // the last map must create exit if it has, and players can not go back
					int[] exitLocal = canUseCells.remove(canUseKeys.remove(MathUtil.getRandom(canUseCells.size())));
					int exitEast = enterInfo.getEast(), exitSouth = exitInfo.getSouth();
					Warp exitWarp = CWarpReader.createWarp(makeWarpId(), mapId, exitLocal[0], exitLocal[1], enterInfo.getMapId(), exitEast, exitSouth, warpResourceGlobalId[EXIT_OUT_RESOURCE_GLOBAL_ID_INDEX]);
					warpManager.addWarp(exitWarp);
					mapInfos[floor].setGoWarp(exitWarp, npcInfoList);
				}
				warpManager.addWarp(comeWarp);
			}
			Warp backWarp = CWarpReader.createWarp(makeWarpId(), mapId, local[0], local[1], backMapId, east, south, resourceGlobalId);
			warpManager.addWarp(backWarp);
			mapInfos[floor].setBackWarp(backWarp, npcInfoList);
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
