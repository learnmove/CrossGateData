package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.Lists;

import cg.base.conf.ConfTech;
import cg.base.conf.IConfTech;
import cg.base.loader.IOCBeanType;
import cg.base.util.MathUtil;
import cg.data.battle.skill.SkillLevelData;
import cg.data.battle.skill.SkillLevelData.SelfEffect;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

@IOCBean(type=IOCBeanType.READER)
public class CSkillDataReader implements ObjectReader<SkillLevelData> {

	@Override
	public List<SkillLevelData> read(ProjectData projectData) {
		MessageManager messageManager = projectData.getMessageManager();
		return ObjectReader.transform(ConfTech.arrayFromExcel(projectData), s -> { return new CSkillData(s, messageManager); });
	}
	
	public static class CSkillData implements SkillLevelData {
		
		protected MessageManager messageManager;
		
		protected String name, techType;
		
		protected SelfEffect[] selfEffects;
		
		protected int skillCode, descriptionId, price;
		
		protected short skillId, costMp, targetType, produces[];
		
		protected byte level, useSpace;
		
		private CSkillData(IConfTech conf, MessageManager messageManager) {
			this(messageManager);
			name = conf.getName();
			techType = conf.getTechType();
			String[] effects = conf.getSelfEffects().length() > 0 ? conf.getSelfEffects().split(",") : new String[0];
			selfEffects = new SelfEffect[effects.length];
			for (int i = 0;i < effects.length;i++) {
				String[] params = effects[i].split(":");
				selfEffects[i] = new CSelfEffect(params[0], params.length > 1 ? MathUtil.stringToShort(params[1]) : 0, this);
			}
			skillCode = conf.getSkillCode();
			descriptionId = conf.getDescriptionId();
			skillId = conf.getSkillId();
			level = conf.getLevel();
			useSpace = conf.getUseSpace();
			targetType = conf.getTargetType();
			price = conf.getPrice();
			costMp = conf.getCostMp();
			short[] produces = conf.getProduce();
			List<Short> list = Lists.newArrayListWithCapacity(produces.length);
			for (short produceId : produces) {
				if (produceId > 0) {
					list.add(produceId);
				}
			}
			produces = new short[list.size()];
			for (int i = 0;i < list.size();i++) {
				produces[i] = list.get(i);
			}
		}
		
		protected CSkillData(MessageManager messageManager) {
			this.messageManager = messageManager;
		}

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
			Message message = messageManager.getMessage(descriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public short getSkillId() {
			return skillId;
		}

		@Override
		public byte getLevel() {
			return level > 9 ? 0 : level;
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

}
