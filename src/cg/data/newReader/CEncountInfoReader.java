package cg.data.newReader;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;

import cg.base.conf.ConfEncount;
import cg.base.conf.IConfEncount;
import cg.data.map.BaseMapArea;
import cg.data.map.MapArea;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EncountInfo;
import cg.data.sprite.EncountInfo.GroupInfo;

public class CEncountInfoReader implements ObjectReader<EncountInfo> {
	
	private static final Logger log = LoggerFactory.getLogger(CEncountInfoReader.class);

	@Override
	public List<EncountInfo> read(ProjectData projectData) {
		IConfEncount[] encounts = ConfEncount.arrayFromExcel(projectData);
		List<EncountInfo> list = Lists.newArrayListWithCapacity(encounts.length);
		try {
			for (IConfEncount confEncount : encounts) {
				list.add(new CEncountInfo(confEncount));
			}
		} catch (Exception e) {
			log.error("", e);
		}
		return list;
	}
	
	private static class CEncountInfo implements EncountInfo {
		
		private static final byte GROUP_COUNT = 10;
		
		private int id;
		
		private MapArea area;
		
		private Range<Byte> amount;
		
		private byte priority;
		
		private List<GroupInfo> groupInfos;
		
		public CEncountInfo(IConfEncount confEncount) throws Exception {
			id = confEncount.getId();
			area = new BaseMapArea(confEncount.getMapId(), confEncount.getWest(), confEncount.getNorth(), confEncount.getEast(), confEncount.getSouth());
			amount = Range.closed(confEncount.getMin(), confEncount.getMax());
			priority = confEncount.getPriority();
			groupInfos = Lists.newLinkedList();
			for (int i = 0;i < GROUP_COUNT;i++) {
				Method getGroup = confEncount.getClass().getMethod("getGroup" + (i + 1));
				int groupId = (Integer) getGroup.invoke(confEncount);
				if (groupId > 0) {
					groupInfos.add(new CGroupInfo(groupId, (Byte) confEncount.getClass().getMethod("getRate" + (i + 1)).invoke(confEncount)));
				}
			}
		}

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
			return ImmutableList.copyOf(groupInfos);
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

}
