package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfTechArea;
import cg.base.loader.IOCBeanType;
import cg.data.item.DropItemGroup;
import cg.data.item.DropItemGroup.DropItem;
import cg.data.map.BaseMapArea;
import cg.data.map.GatherArea;
import cg.data.map.GatherArea.GatherInfo;
import cg.data.map.MapArea;

@IOCBean(type=IOCBeanType.READER)
class CGatherAreaReader extends BaseObjectReader<GatherArea, ConfTechArea> {
	
	private static class CGatherInfo implements GatherInfo {
		
		private String name;
		
		private int id;
		
		private short skillId, failRate;
		
		private DropItemGroup itemGroup;

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public short getFailRate() {
			return failRate;
		}

		@Override
		public DropItemGroup getDropItems() {
			return itemGroup;
		}
		
	}
	
	private static class CGatherArea implements GatherArea {
		
		private GatherInfo gatherInfo;
		
		private MapArea area;

		@Override
		public GatherInfo getGatherInfo() {
			return gatherInfo;
		}

		@Override
		public MapArea getArea() {
			return area;
		}
		
	}

	private static class CDropItem implements DropItem {
		
		private static final byte MAX_COUNT = 3;
		
		private int itemId, rate;
		
		public CDropItem(int itemId, int rate) {
			this.itemId = itemId;
			this.rate = rate;
		}
	
		public int getItemId() {
			return itemId;
		}
	
		public int getRate() {
			return rate;
		}

		@Override
		public int getMaxCount() {
			return MAX_COUNT;
		}
	
	}
	
	private static class CDropItemGroup implements DropItemGroup {
		
		private DropItem[] dropItems;
		
		private int totalRate;
		
		public CDropItemGroup(DropItem[] dropItems) {
			this.dropItems = dropItems;
			for (DropItem dropItem : dropItems) {
				totalRate += dropItem.getRate();
			}
		}
	
		@Override
		public DropItem[] getDropItems() {
			return dropItems;
		}
	
		@Override
		public int getTotalRate() {
			return totalRate;
		}
		
	}

	@Override
	public void output(File outFile, Collection<GatherArea> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfTechArea> getFromClass() {
		return ConfTechArea.class;
	}

	@Override
	GatherArea transform(ConfTechArea s) {
		CGatherArea ret = new CGatherArea();
		CGatherInfo gatherInfo = new CGatherInfo();
		gatherInfo.name = s.getName();
		gatherInfo.id = s.getId();
		gatherInfo.skillId = s.getSkillId();
		gatherInfo.failRate = s.getFailRate();
		int[] itemIds = s.getItemIds();
		int[] rates = s.getRates();
		DropItem[] dropItems = new DropItem[itemIds.length];
		for (int i = 0;i < itemIds.length;i++) {
			dropItems[i] = new CDropItem(itemIds[i], rates[i] == -1 ? rates[i] : 100);
		}
		gatherInfo.itemGroup = new CDropItemGroup(dropItems);
		ret.gatherInfo = gatherInfo;
		ret.area = new BaseMapArea(s.getMapId(), s.getWest(), s.getNorth(), s.getEast(), s.getSouth());
		return ret;
	}

}
