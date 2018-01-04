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

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;

import cg.base.conf.ConfEnemyBase;
import cg.base.loader.IOCBeanType;
import cg.data.sprite.CreatureTemplate;

@IOCBean(type=IOCBeanType.READER)
class CEnemyBaseInfoReader extends BaseObjectReader<CreatureTemplate, ConfEnemyBase> {
	
	private static class CCreatureTemplate implements CreatureTemplate {
		
		private String name;
		
		private int id;
		
		private short basePointCount;
		
		private byte basePointFloat;
		
		private byte race;
		
		private Table<String, Byte, Short> attributes;
		
		private short difficultyOfCatch;
		
		private short cardLevel;
		
		private short needCharm;
		
		private byte[] elementAttributes;
		
		private byte cardType;
		
		private byte skillAmount;
		
		private int cardFileId;
		
		private int animationId;
		
		private boolean canCatch;
		
		private int[] skillCodes;

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
		public short getCardLevel() {
			return cardLevel;
		}

		@Override
		public short getNeedCharm() {
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

	@Override
	Class<ConfEnemyBase> getFromClass() {
		return ConfEnemyBase.class;
	}

	@Override
	CreatureTemplate transform(ConfEnemyBase s) {
		CCreatureTemplate ret = new CCreatureTemplate();
		ret.name = s.getName();
		ret.id = s.getId();
		ret.basePointCount = s.getBasePointCount();
		ret.basePointFloat = s.getBasePointFloat();
		ret.race = s.getRace();
		ret.difficultyOfCatch = s.getDifficultyOfCatch();
		ret.cardLevel = s.getCardLevel();
		ret.needCharm = s.getNeedCharm();
		ret.cardType = s.getCardType();
		ret.skillAmount = s.getSkillAmount();
		ret.animationId = s.getAnimationId();
		ret.cardFileId = s.getCardFileId();
		ret.canCatch = s.getCanCatch();
		ret.elementAttributes = s.getElements();
		ret.skillCodes = s.getSkills();
		
		Table<String, Byte, Short> attributes = HashBasedTable.create();
		attributes.put(ATTRIBUTE_TYPE_BP, BP_VITALITY, s.getVitality());
		attributes.put(ATTRIBUTE_TYPE_BP, BP_STRENGTH, s.getStrength());
		attributes.put(ATTRIBUTE_TYPE_BP, BP_TOUGH, s.getTough());
		attributes.put(ATTRIBUTE_TYPE_BP, BP_QUICK, s.getQuick());
		attributes.put(ATTRIBUTE_TYPE_BP, BP_MAGIC, s.getMagic());
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_HIT, s.getHit());
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_AVOID, s.getAvoid());
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_CRITICAL, s.getCritical());
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_COUNTER, s.getCounter());
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_POISON, s.getPoison());
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_INTOXICATION, s.getIntoxication());
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_SLEEP, s.getSleep());
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_CONFUSION, s.getConfusion());
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_STONE, s.getStone());
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_AMNESIA, s.getAmnesia());
		ret.attributes = ImmutableTable.copyOf(attributes);
		return ret;
	}

}
