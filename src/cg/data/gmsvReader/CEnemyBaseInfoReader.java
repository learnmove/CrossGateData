package cg.data.gmsvReader;

import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_AVOID;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_COUNTER;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_CRITICAL;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_HIT;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_AMNESIA;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_CONFUSION;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_INTOXICATION;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_POISON;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_SLEEP;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_STONE;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_BP;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_EXTEND;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_RESIST;
import static cg.base.sprite.Attribute.BP_MAGIC;
import static cg.base.sprite.Attribute.BP_QUICK;
import static cg.base.sprite.Attribute.BP_STRENGTH;
import static cg.base.sprite.Attribute.BP_TOUGH;
import static cg.base.sprite.Attribute.BP_VITALITY;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import cg.base.conf.ConfEnemyBase;
import cg.base.loader.IOCBeanType;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.CreatureTemplate;

@IOCBean(type=IOCBeanType.READER)
class CEnemyBaseInfoReader implements ObjectReader<CreatureTemplate> {

	@Override
	public List<CreatureTemplate> read(ProjectData projectData) {
		return ObjectReader.transform(ConfEnemyBase.arrayFromExcel(projectData), s -> { return new CCreatureTemplate(s); });
	}
	
	private static class CCreatureTemplate implements CreatureTemplate {
		
		private String name;
		
		private int id;
		
		private short basePointCount;
		
		private byte basePointFloat;
		
		private byte race;
		
		private Table<String, Byte, Short> attributes;
		
		private short difficultyOfCatch;
		
		private byte cardLevel;
		
		private byte needCharm;
		
		private byte[] elementAttributes;
		
		private byte cardType;
		
		private byte skillAmount;
		
		private int cardFileId;
		
		private int animationId;
		
		private boolean canCatch;
		
		private int[] skillCodes;
		
		public CCreatureTemplate(ConfEnemyBase conf) {
			name = conf.getName();
			id = conf.getId();
			basePointCount = conf.getBasePointCount();
			basePointFloat = conf.getBasePointFloat();
			race = conf.getRace();
			difficultyOfCatch = conf.getDifficultyOfCatch();
			cardLevel = conf.getCardLevel();
			needCharm = conf.getNeedCharm();
			cardType = conf.getCardType();
			skillAmount = conf.getSkillAmount();
			animationId = conf.getAnimationId();
			cardFileId = conf.getCardFileId();
			canCatch = conf.getCanCatch();
			elementAttributes = conf.getElements();
			skillCodes = conf.getSkills();
			
			attributes = HashBasedTable.create();
			attributes.put(ATTRIBUTE_TYPE_BP, BP_VITALITY, conf.getVitality());
			attributes.put(ATTRIBUTE_TYPE_BP, BP_STRENGTH, conf.getStrength());
			attributes.put(ATTRIBUTE_TYPE_BP, BP_TOUGH, conf.getTough());
			attributes.put(ATTRIBUTE_TYPE_BP, BP_QUICK, conf.getQuick());
			attributes.put(ATTRIBUTE_TYPE_BP, BP_MAGIC, conf.getMagic());
			attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_HIT, conf.getHit());
			attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_AVOID, conf.getAvoid());
			attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_CRITICAL, conf.getCritical());
			attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_COUNTER, conf.getCounter());
			attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_POISON, conf.getPoison());
			attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_INTOXICATION, conf.getIntoxication());
			attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_SLEEP, conf.getSleep());
			attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_CONFUSION, conf.getConfusion());
			attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_STONE, conf.getStone());
			attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_AMNESIA, conf.getAmnesia());
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public short getBasePointCount() {
			return basePointCount;
		}

		@Override
		public byte getBasePointFloat() {
			return basePointFloat;
		}

		@Override
		public byte getRace() {
			return race;
		}

		@Override
		public short getAttributeValue(String attributeType, byte type) {
			return attributes.get(attributeType, type);
		}

		@Override
		public short getDifficultyOfCatch() {
			return difficultyOfCatch;
		}

		@Override
		public byte getCardLevel() {
			return cardLevel;
		}

		@Override
		public byte getNeedCharm() {
			return needCharm;
		}

		@Override
		public byte getCardType() {
			return cardType;
		}

		@Override
		public byte getSkillAmount() {
			return skillAmount;
		}

		@Override
		public int getCardFileId() {
			return cardFileId;
		}

		@Override
		public int getAnimationId() {
			return animationId;
		}

		@Override
		public boolean getCanCatch() {
			return canCatch;
		}

		@Override
		public int[] getSkillIds() {
			return skillCodes;
		}

		@Override
		public byte[] getElements() {
			return elementAttributes;
		}
		
	}

	@Override
	public void output(File outFile, Collection<CreatureTemplate> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
