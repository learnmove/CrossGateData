package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfJob;
import cg.base.loader.IOCBeanType;
import cg.data.job.Job;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortByteMap;
import gnu.trove.map.TShortByteMap;
import gnu.trove.map.hash.TShortByteHashMap;

@IOCBean(type=IOCBeanType.READER)
class CJobReader extends BaseObjectReader<Job, ConfJob> {
	
	private static class CJob implements Job {
		
		private String name;
		
		private short id;
		
		private byte type;
		
		private int cost, fame;
		
		private byte[] euipmentLevels;
		
		private TShortByteMap promotionSkills;

		@Override
		public String getName() {
			return name;
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public byte getEuipmentLevel(byte type) {
			return type < euipmentLevels.length ? euipmentLevels[type] : -1;
		}

		@Override
		public short[] getPromotionSkillIds() {
			return promotionSkills.keys();
		}

		@Override
		public byte getType() {
			return type;
		}

		@Override
		public int getCost() {
			return cost;
		}

		@Override
		public int getFame() {
			return fame;
		}

		@Override
		public byte getPromotionSkillLevel(short skillId) {
			return promotionSkills.get(skillId);
		}
		
	}

	@Override
	public void output(File outFile, Collection<Job> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfJob> getFromClass() {
		return ConfJob.class;
	}

	@Override
	Job transform(ConfJob s) {
		CJob ret = new CJob();
		ret.name = s.getName();
		ret.id = s.getId();
		ret.type = s.getType();
		ret.cost = s.getCost();
		ret.fame = s.getFame();
		TShortByteMap promotionSkills = new TShortByteHashMap();
		short[] skillIds = s.getPromotionSkillIds();
		byte[] skillLevels = s.getPromotionSkillLevels();
		for (int i = 0;i < skillIds.length;i++) {
			if (skillIds[i] > 0) {
				promotionSkills.put(skillIds[i], skillLevels[i]);
			}
		}
		ret.promotionSkills = new TUnmodifiableShortByteMap(promotionSkills);
		ret.euipmentLevels = s.getEuipmentLevels();
		return ret;
	}

}
