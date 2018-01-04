package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

import cg.base.conf.ConfEncount;
import cg.base.loader.IOCBeanType;
import cg.data.map.BaseMapArea;
import cg.data.map.MapArea;
import cg.data.sprite.EncountInfo;
import cg.data.sprite.EncountInfo.GroupInfo;

@IOCBean(type=IOCBeanType.READER)
class CEncountInfoReader extends BaseObjectReader<EncountInfo, ConfEncount> {
	
	private static class CEncountInfo implements EncountInfo {
		
		private int id;
		
		private MapArea area;
		
		private Range<Byte> amount;
		
		private byte priority;
		
		private List<GroupInfo> groupInfos;

		@Override
		public int getId() {
			return id;
		}

		@Override
		public MapArea getArea() {
			return area;
		}

		@Override
		public Range<Byte> getAmount() {
			return amount;
		}

		@Override
		public byte getPriority() {
			return priority;
		}

		@Override
		public List<GroupInfo> getGroupInfos() {
			return groupInfos;
		}
		
	}
	
	private static class CGroupInfo implements GroupInfo {
		
		private int groupId;
		
		private byte rate;
		
		public CGroupInfo(int groupId, byte rate) {
			this.groupId = groupId;
			this.rate = rate;
		}

		@Override
		public int getGroupId() {
			return groupId;
		}

		@Override
		public byte getRate() {
			return rate;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EncountInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfEncount> getFromClass() {
		return ConfEncount.class;
	}

	@Override
	EncountInfo transform(ConfEncount s) {
		CEncountInfo ret = new CEncountInfo();
		ret.id = s.getId();
		ret.area = new BaseMapArea(s.getMapId(), s.getWest(), s.getNorth(), s.getEast(), s.getSouth());
		ret.amount = Range.closed(s.getMin(), s.getMax());
		ret.priority = s.getPriority();
		int[] groups = s.getGroups();
		byte[] rates = s.getRates();
		List<GroupInfo> groupInfos = Lists.newArrayListWithCapacity(groups.length);
		for (int i = 0;i < groups.length;i++) {
			if (groups[i] == 0) {
				break;
			}
			groupInfos.add(new CGroupInfo(groups[i], rates[i]));
		}
		ret.groupInfos = ImmutableList.copyOf(groupInfos);
		return ret;
	}

}
