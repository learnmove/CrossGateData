package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.Lists;

import cg.base.conf.ConfTech;
import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.battle.skill.SkillLevelData;
import cg.data.battle.skill.SkillLevelData.SelfEffect;
import cg.data.resource.MessageManager;
import cg.data.resource.ProjectData;

@IOCBean(type=IOCBeanType.READER)
public class CSkillDataReader extends BaseObjectReader<SkillLevelData, ConfTech> {
	
	public static class CSkillData implements SkillLevelData {
		
		protected static MessageManager messageManager;
		
		protected String name, techType;
		
		protected SelfEffect[] selfEffects;
		
		protected int skillCode, descriptionId, price;
		
		protected short skillId, costMp, targetType, produces[];
		
		protected byte level, useSpace;

		@Override
		public String getName() {
			return name;
		}

		@Override
		public String getTechType() {
			return techType;
		}

		@Override
		public SelfEffect[] getSelfEffects() {
			return selfEffects;
		}

		@Override
		public int getSkillCode() {
			return skillCode;
		}

		@Override
		public String getDescription() {
			return messageManager.getMessage(descriptionId);
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public byte getLevel() {
			return level > 20 ? 1 : level;
		}

		@Override
		public byte getUseSpace() {
			return useSpace;
		}

		@Override
		public int getPrice() {
			return price;
		}

		@Override
		public short getCostMp() {
			return costMp;
		}

		@Override
		public short getTargetType() {
			return targetType;
		}

		@Override
		public int getBeginAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getAttachAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getHitAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getBackAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getTrackAnimation() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public short[] getProduces() {
			return produces;
		}
		
	}
	
	public static class CSelfEffect implements SelfEffect {
		
		protected String type;
		
		protected short value;
		
		protected SkillLevelData skillData;
		
		public CSelfEffect(String type, short value, SkillLevelData skillData) {
			this.type = type;
			this.value = value;
		}

		@Override
		public String getType() {
			return type;
		}

		@Override
		public short getValue() {
			return value;
		}

		@Override
		public String toString() {
			return getType() + ":" + getValue();
		}
		
	}

	@Override
	public void output(File outFile, Collection<SkillLevelData> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfTech> getFromClass() {
		return ConfTech.class;
	}

	@Override
	SkillLevelData transform(ConfTech s) {
		CSkillData ret = new CSkillData();
		ret.name = s.getName();
		ret.techType = s.getTechType();
		String[] effects = s.getSelfEffects().length() > 0 ? s.getSelfEffects().split(",") : new String[0];
		ret.selfEffects = new SelfEffect[effects.length];
		for (int i = 0;i < effects.length;i++) {
			String[] params = effects[i].split(":");
			ret.selfEffects[i] = new CSelfEffect(params[0], params.length > 1 ? MathUtil.stringToShort(params[1]) : 0, ret);
		}
		ret.skillCode = s.getSkillCode();
		ret.descriptionId = s.getDescriptionId();
		ret.skillId = s.getSkillId();
		ret.level = s.getLevel();
		ret.useSpace = s.getUseSpace();
		ret.targetType = s.getTargetType();
		ret.price = s.getPrice();
		ret.costMp = s.getCostMp();
		short[] produces = s.getProduce();
		List<Short> list = Lists.newArrayListWithCapacity(produces.length);
		for (short produceId : produces) {
			if (list.size() == 0) {
				list.add(produceId);
			}
			if (list.get(list.size() - 1) == produceId) {
				list.clear();
				break;
			} else {
				list.add(produceId);
			}
		}
		ret.produces = new short[list.size()];
		for (int i = 0;i < list.size();i++) {
			ret.produces[i] = list.get(i);
		}
		return ret;
	}

	@Override
	protected void readFinish(ProjectData projectData) {
		CSkillData.messageManager = projectData.getMessageManager();
	}

}
