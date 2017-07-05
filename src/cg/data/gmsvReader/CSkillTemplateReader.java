package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;

import cg.base.conf.ConfSkill;
import cg.base.conf.IConfSkill;
import cg.base.loader.IOCBeanType;
import cg.base.skill.SkillTemplate;
import cg.base.sprite.Attribute;
import cg.base.sprite.AttributeCell;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

@IOCBean(type=IOCBeanType.READER)
public class CSkillTemplateReader implements ObjectReader<SkillTemplate> {

	@Override
	public List<SkillTemplate> read(ProjectData projectData) {
		MessageManager messageManager = projectData.getMessageManager();
		return ObjectReader.transform(ConfSkill.arrayFromExcel(projectData), s -> { return new CSkillTemplate(s, messageManager);});
	}
	
	public static class CSkillTemplate implements SkillTemplate {
		
		protected String name;
		
		protected short id, studyPrice, needWeaponType, doubleExpType, priceRate;
		
		protected int descriptionId;
		
		protected byte type, useSpace, expType, effectWorkLevel;
		
		protected boolean notGainExp;
		
		protected Map<String, AttributeCell> attributeCells;
		
		protected final MessageManager messageManager;
		
		private CSkillTemplate(IConfSkill conf, MessageManager messageManager) {
			this(messageManager);
			name = conf.getName();
			id = conf.getId();
			descriptionId = conf.getDescriptionId();
			type = conf.getType();
			effectWorkLevel = conf.getEffectWorkLevel();
			studyPrice = conf.getStudyPrice();
			priceRate = conf.getPriceRate();
			needWeaponType = conf.getNeedWeaponType();
			expType = conf.getExpType();
			useSpace = conf.getUseSpace();
			Map<String, AttributeCell> attributeCells = Maps.newHashMap();
			AttributeCell attributeCell = new AttributeCell(Attribute.ATTRIBUTE_TYPE_WORK);
			attributeCell.setValue(Attribute.ATTRIBUTE_WORK_STAMINA, conf.getStamina());
			attributeCell.setValue(Attribute.ATTRIBUTE_WORK_DEXTERITY, conf.getDexterity());
			attributeCell.setValue(Attribute.ATTRIBUTE_WORK_INTELLIGENCE, conf.getIntelligence());
			attributeCells.put(attributeCell.getAttributeType(), attributeCell);
			this.attributeCells = ImmutableMap.copyOf(attributeCells);
			notGainExp = conf.getNotGainExp();
			doubleExpType = conf.getDoubleExpType();
		}
		
		protected CSkillTemplate(MessageManager messageManager) {
			this.messageManager = messageManager;
		}

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

}
