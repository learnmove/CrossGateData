package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.Map;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import cg.base.conf.ConfSkill;
import cg.base.loader.IOCBeanType;
import cg.base.skill.SkillTemplate;
import cg.base.sprite.Attribute;
import cg.base.sprite.AttributeCell;
import cg.data.resource.MessageManager;

@IOCBean(type=IOCBeanType.READER)
public class CSkillTemplateReader extends BaseObjectReader<SkillTemplate, ConfSkill> {
	
	public static class CSkillTemplate implements SkillTemplate {
		
		protected String name;
		
		protected short id, studyPrice, needWeaponType, doubleExpType, priceRate;
		
		protected int descriptionId;
		
		protected byte type, useSpace, expType, effectWorkLevel;
		
		protected boolean notGainExp;
		
		protected Map<String, AttributeCell> attributeCells;
		
		protected static MessageManager messageManager;

		@Override
		public String getName() {
			return name;
		}

		@Override
		public short getId() {
			return id;
		}

		@Override
		public String getDescription() {
			return messageManager.getMessage(descriptionId);
		}

		@Override
		public byte getType() {
			return type;
		}

		@Override
		public short getStudyPrice() {
			return studyPrice;
		}

		@Override
		public short getNeedWeaponType() {
			return needWeaponType;
		}

		@Override
		public byte getUseSpace() {
			return useSpace;
		}

		@Override
		public byte getExpType() {
			return expType;
		}

		@Override
		public short getDoubleExpType() {
			return doubleExpType;
		}

		@Override
		public byte getEffectWorkLevel() {
			return effectWorkLevel;
		}

		@Override
		public short getPriceRate() {
			return priceRate;
		}

		@Override
		public Map<String, AttributeCell> getAttributes() {
			return attributeCells;
		}

		@Override
		public boolean getNotGainExp() {
			return notGainExp;
		}
		
	}

	@Override
	public void output(File outFile, Collection<SkillTemplate> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfSkill> getFromClass() {
		return ConfSkill.class;
	}

	@Override
	SkillTemplate transform(ConfSkill s) {
		CSkillTemplate ret = new CSkillTemplate();
		ret.name = s.getName();
		ret.id = s.getId();
		ret.descriptionId = s.getDescriptionId();
		ret.type = s.getType();
		ret.effectWorkLevel = s.getEffectWorkLevel();
		ret.studyPrice = s.getStudyPrice();
		ret.priceRate = s.getPriceRate();
		ret.needWeaponType = s.getNeedWeaponType();
		ret.expType = s.getExpType();
		ret.useSpace = s.getUseSpace();
		Map<String, AttributeCell> attributeCells = Maps.newHashMap();
		AttributeCell attributeCell = new AttributeCell(Attribute.ATTRIBUTE_TYPE_WORK);
		attributeCell.setValue(Attribute.ATTRIBUTE_WORK_STAMINA, s.getStamina());
		attributeCell.setValue(Attribute.ATTRIBUTE_WORK_DEXTERITY, s.getDexterity());
		attributeCell.setValue(Attribute.ATTRIBUTE_WORK_INTELLIGENCE, s.getIntelligence());
		attributeCells.put(attributeCell.getAttributeType(), attributeCell);
		ret.attributeCells = ImmutableMap.copyOf(attributeCells);
		ret.notGainExp = s.getNotGainExp();
		ret.doubleExpType = s.getDoubleExpType();
		return ret;
	}

}
