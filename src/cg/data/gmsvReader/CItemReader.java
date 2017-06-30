package cg.data.gmsvReader;

import static cg.base.sprite.Attribute.ATTRIBUTE_AGILITY;
import static cg.base.sprite.Attribute.ATTRIBUTE_ATTACK;
import static cg.base.sprite.Attribute.ATTRIBUTE_DEFEND;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_AVOID;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_COUNTER;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_CRITICAL;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_HIT;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_MIND;
import static cg.base.sprite.Attribute.ATTRIBUTE_EXTEND_RECOVER;
import static cg.base.sprite.Attribute.ATTRIBUTE_HP_MAX;
import static cg.base.sprite.Attribute.ATTRIBUTE_MP_MAX;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_AMNESIA;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_CONFUSION;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_INTOXICATION;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_MAGIC;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_POISON;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_SLEEP;
import static cg.base.sprite.Attribute.ATTRIBUTE_RESIST_STONE;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_BASE;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_EXTEND;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_RESIST;
import static cg.base.sprite.Attribute.ATTRIBUTE_TYPE_WORK;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_CHARM;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_DEXTERITY;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_INTELLIGENCE;
import static cg.base.sprite.Attribute.ATTRIBUTE_WORK_STAMINA;
import static cg.base.util.MathUtil.createRange;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tool.server.ioc.IOCBean;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Range;
import com.google.common.collect.Table;

import cg.base.conf.ConfItemSet;
import cg.base.conf.IConfItemSet;
import cg.base.loader.IOCBeanType;
import cg.data.item.ItemTemplate;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.Message;

@IOCBean(type=IOCBeanType.READER)
class CItemReader implements ObjectReader<ItemTemplate> {

	@Override
	public List<ItemTemplate> read(ProjectData projectData) {
		MessageManager messageManager = projectData.getMessageManager();
		return ObjectReader.transform(ConfItemSet.arrayFromExcel(projectData), s -> { return read(s, messageManager); });
	}
	
	private static CItemTemplate read(IConfItemSet conf, MessageManager messageManager) {
		CItemTemplate itemTemplate = new CItemTemplate();
		itemTemplate.messageManager = messageManager;
		itemTemplate.unidentifyName = conf.getUnidentifyName();
		itemTemplate.identifyName = conf.getIdentifyName();
		itemTemplate.useEffect = conf.getUseEffect();
		itemTemplate.useInit = conf.getUseInit();
		itemTemplate.useProcess = conf.getUseProcess();
		itemTemplate.dropProcess = conf.getDropProcess();
		itemTemplate.pickupProcess = conf.getPickupProcess();
		itemTemplate.id = conf.getId();
		itemTemplate.iconId = conf.getIconId();
		itemTemplate.sellPrice = conf.getSellPrice();
		itemTemplate.type = conf.getType();
		itemTemplate.doubleHand = conf.getDoubleHand();
		itemTemplate.canDoubleClick = conf.getCanDoubleClick();
		itemTemplate.canUseInBattle = conf.getCanUseInBattle();
		itemTemplate.groupSize = (short) Math.max(conf.getGroupSize(), 1);
		itemTemplate.level = conf.getLevel();
		itemTemplate.durable = createRange(conf.getDurableMin(), conf.getDurableMax());
		itemTemplate.attackCount = createRange(conf.getAttackCountMin(), conf.getAttackCountMax());
		itemTemplate.isPrecent = conf.getIsPrecent();
		itemTemplate.luck = createRange(conf.getLuckMin(), conf.getLuckMax());
		itemTemplate.elementAttribute_1 = conf.getElementType1();
		itemTemplate.elementAttribute_2 = conf.getElementType2();
		itemTemplate.elementAttributeValue_1 = conf.getElementValue1();
		itemTemplate.elementAttributeValue_2 = conf.getElementValue2();
		itemTemplate.specialType = conf.getSpecialType();
		itemTemplate.subTypeParam = conf.getSubTypeParams();
		itemTemplate.gemWeaponType = conf.getGemWeaponType();
		itemTemplate.gemArmorType = conf.getGemArmorType();
		itemTemplate.logoutDispear = conf.getLogoutDispear();
		itemTemplate.dropDispear = conf.getDropDispear();
		itemTemplate.canPostByPet = conf.getCanPostByPet();
		itemTemplate.canComposite = conf.getCanComposite();
		itemTemplate.descriptionId = conf.getDescriptionId() == 0 ? -1 : conf.getDescriptionId();
		itemTemplate.rightButtonDescriptionId = conf.getRightButtonDescriptionId() == 0 ? -1 : conf.getRightButtonDescriptionId();
		itemTemplate.identifyRate = conf.getIdentifyRate();
		itemTemplate.magicAttack = createRange(conf.getMagicAttackMin(), conf.getMagicAttackMax());
		
		Table<String, Byte, Range<Integer>> attributes = itemTemplate.attributes;
		attributes.put(ATTRIBUTE_TYPE_BASE, ATTRIBUTE_ATTACK, createRange(conf.getAttackMin(), conf.getAttackMax()));
		attributes.put(ATTRIBUTE_TYPE_BASE, ATTRIBUTE_DEFEND, createRange(conf.getDefendMin(), conf.getDefendMax()));
		attributes.put(ATTRIBUTE_TYPE_BASE, ATTRIBUTE_AGILITY, createRange(conf.getAgilityMin(), conf.getAgilityMax()));
		attributes.put(ATTRIBUTE_TYPE_BASE, ATTRIBUTE_HP_MAX, createRange(conf.getHpMin(), conf.getHpMax()));
		attributes.put(ATTRIBUTE_TYPE_BASE, ATTRIBUTE_MP_MAX, createRange(conf.getMpMin(), conf.getMpMax()));
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_MIND, createRange(conf.getMindMin(), conf.getMindMax()));
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_RECOVER, createRange(conf.getRecoverMin(), conf.getRecoverMax()));
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_CRITICAL, createRange(conf.getCriticalMin(), conf.getCriticalMax()));
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_COUNTER, createRange(conf.getCounterMin(), conf.getCounterMax()));
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_HIT, createRange(conf.getHitMin(), conf.getHitMax()));
		attributes.put(ATTRIBUTE_TYPE_EXTEND, ATTRIBUTE_EXTEND_AVOID, createRange(conf.getAovidMin(), conf.getAovidMax()));
		attributes.put(ATTRIBUTE_TYPE_WORK, ATTRIBUTE_WORK_CHARM, createRange(conf.getCharmMin(), conf.getCharmMax()));
		attributes.put(ATTRIBUTE_TYPE_WORK, ATTRIBUTE_WORK_STAMINA, createRange(conf.getStaminaMax(), conf.getStaminaMax()));
		attributes.put(ATTRIBUTE_TYPE_WORK, ATTRIBUTE_WORK_DEXTERITY, createRange(conf.getDexterityMin(), conf.getDexterityMax()));
		attributes.put(ATTRIBUTE_TYPE_WORK, ATTRIBUTE_WORK_INTELLIGENCE, createRange(conf.getIntelligenceMin(), conf.getIntelligenceMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_POISON, createRange(conf.getPoisonMin(), conf.getPoisonMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_SLEEP, createRange(conf.getSleepMin(), conf.getSleepMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_STONE, createRange(conf.getStoneMin(), conf.getStoneMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_INTOXICATION, createRange(conf.getIntoxicationMin(), conf.getIntoxicationMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_CONFUSION, createRange(conf.getConfusionMin(), conf.getConfusionMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_AMNESIA, createRange(conf.getAmnesiaMin(), conf.getAmnesiaMax()));
		attributes.put(ATTRIBUTE_TYPE_RESIST, ATTRIBUTE_RESIST_MAGIC, createRange(conf.getResistMagicMin(), conf.getResistMagicMax()));
		
		return itemTemplate;
	}
	
	private static class CItemTemplate implements ItemTemplate {
		
		private MessageManager messageManager;
		
		private int id;
		
		private String unidentifyName;
		
		private String identifyName;
		
		private int buyPrice;
		
		private int sellPrice;
		
		private short groupSize;
		
		private String useEffect;
		
		private String useInit;
		
		private String useProcess;
		
		private String dropProcess;
		
		private String pickupProcess;
		
		private int iconId;
		
		private byte type;
		
		private boolean doubleHand;
		
		private boolean canDoubleClick;
		
		private byte level;
		
		private Range<Short> durable;
		
		private Range<Byte> attackCount;
		
		private boolean isPrecent;
		
		private Table<String, Byte, Range<Integer>> attributes;
		
		private ListMultimap<String, Byte> attributeTypes;
		
		private Range<Byte> luck;
		
		private byte elementAttribute_1;
		
		private byte elementAttribute_2;
		
		private byte elementAttributeValue_1;
		
		private byte elementAttributeValue_2;
		
		private short specialType;
		
		private int[] subTypeParam;
		
		private short gemWeaponType;
		
		private short gemArmorType;
		
		private boolean logoutDispear;
		
		private boolean dropDispear;
		
		private boolean canPostByPet;
		
		private boolean canComposite;
		
		private boolean canUseInBattle;
		
		private int descriptionId;
		
		private int rightButtonDescriptionId;
		
		private byte identifyRate;
		
		private Range<Short> magicAttack;
		
		public CItemTemplate() {
			attributes = HashBasedTable.create();
			attributeTypes = ArrayListMultimap.create();
			subTypeParam = new int[2];
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder(getClass().getName());
			sb.append(" : id = " + id);
			sb.append(" ; unidentifyName = " + unidentifyName);
			sb.append(" ; identifyName = " + identifyName);
			sb.append(" ; specialType = " + specialType);
			sb.append(" ; sellPrice = " + sellPrice);
			sb.append(" ; groupSize = " + groupSize);
			sb.append(" ; useEffect = " + useEffect);
			sb.append(" ; useInit = " + useInit);
			sb.append(" ; useProcess = " + useProcess);
			sb.append(" ; dropProcess = " + dropProcess);
			sb.append(" ; pickupProcess = " + pickupProcess);
			sb.append(" ; iconId = " + iconId);
			sb.append(" ; type = " + type);
			sb.append(" ; doubleHand = " + doubleHand);
			sb.append(" ; canDoubleClick = " + canDoubleClick);
			sb.append(" ; level = " + level);
			sb.append(" ; durable " + durable);
			sb.append(" ; attackCount " + attackCount);
			sb.append(" ; isPrecent = " + isPrecent);
			Iterator<String> keySet = attributes.rowKeySet().iterator();
			while (keySet.hasNext()) {
				String valueKey = keySet.next();
				Map<Byte, Range<Integer>> value = attributes.row(valueKey);
				Iterator<Byte> keys = value.keySet().iterator();
				while (keys.hasNext()) {
					if (valueKey.equals(ATTRIBUTE_TYPE_BASE)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_AGILITY : 
							sb.append(" ; ATTRIBUTE_AGILITY = " + value.get(key));
							break;
						case ATTRIBUTE_ATTACK : 
							sb.append(" ; ATTRIBUTE_ATTACK = " + value.get(key));
							break;
						case ATTRIBUTE_DEFEND : 
							sb.append(" ; ATTRIBUTE_DEFEND = " + value.get(key));
							break;
						case ATTRIBUTE_HP_MAX : 
							sb.append(" ; ATTRIBUTE_HP_MAX = " + value.get(key));
							break;
						case ATTRIBUTE_MP_MAX : 
							sb.append(" ; ATTRIBUTE_MP_MAX = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					} else if (valueKey.equals(ATTRIBUTE_TYPE_EXTEND)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_EXTEND_AVOID : 
							sb.append(" ; ATTRIBUTE_EXTEND_AVOID = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_COUNTER : 
							sb.append(" ; ATTRIBUTE_EXTEND_COUNTER = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_CRITICAL : 
							sb.append(" ; ATTRIBUTE_EXTEND_CRITICAL = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_HIT : 
							sb.append(" ; ATTRIBUTE_EXTEND_HIT = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_MIND : 
							sb.append(" ; ATTRIBUTE_EXTEND_MIND = " + value.get(key));
							break;
						case ATTRIBUTE_EXTEND_RECOVER : 
							sb.append(" ; ATTRIBUTE_EXTEND_RECOVER = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					} else if (valueKey.equals(ATTRIBUTE_TYPE_RESIST)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_RESIST_AMNESIA : 
							sb.append(" ; ATTRIBUTE_RESIST_AMNESIA = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_CONFUSION : 
							sb.append(" ; ATTRIBUTE_RESIST_CONFUSION = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_INTOXICATION : 
							sb.append(" ; ATTRIBUTE_RESIST_INTOXICATION = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_MAGIC : 
							sb.append(" ; ATTRIBUTE_RESIST_MAGIC = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_POISON : 
							sb.append(" ; ATTRIBUTE_RESIST_POISON = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_SLEEP : 
							sb.append(" ; ATTRIBUTE_RESIST_SLEEP = " + value.get(key));
							break;
						case ATTRIBUTE_RESIST_STONE : 
							sb.append(" ; ATTRIBUTE_RESIST_STONE = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					} else if (valueKey.equals(ATTRIBUTE_TYPE_WORK)) {
						byte key = keys.next();
						switch (key) {
						case ATTRIBUTE_WORK_CHARM : 
							sb.append(" ; ATTRIBUTE_WORK_CHARM = " + value.get(key));
							break;
						case ATTRIBUTE_WORK_DEXTERITY : 
							sb.append(" ; ATTRIBUTE_WORK_DEXTERITY = " + value.get(key));
							break;
						case ATTRIBUTE_WORK_INTELLIGENCE : 
							sb.append(" ; ATTRIBUTE_WORK_INTELLIGENCE = " + value.get(key));
							break;
						case ATTRIBUTE_WORK_STAMINA : 
							sb.append(" ; ATTRIBUTE_WORK_STAMINA = " + value.get(key));
							break;
						default : 
							sb.append(" ; unknow type = " + key + " ; value = " + value.get(key));
						}
					}
				}
			}
			sb.append(" ; luck " + luck);
			sb.append(" ; elementAttribute_1 = " + elementAttribute_1);
			sb.append(" ; elementAttribute_2 = " + elementAttribute_2);
			sb.append(" ; elementAttributeValue_1 = " + elementAttributeValue_1);
			sb.append(" ; elementAttributeValue_2 = " + elementAttributeValue_2);
			sb.append(" ; subTypeParam = " + subTypeParam);
			sb.append(" ; gemWeaponType = " + gemWeaponType);
			sb.append(" ; gemArmorType = " + gemArmorType);
			sb.append(" ; logoutDispear = " + logoutDispear);
			sb.append(" ; dropDispear = " + dropDispear);
			sb.append(" ; canPostByPet = " + canPostByPet);
			sb.append(" ; canComposite = " + canComposite);
			sb.append(" ; description = " + getDescription());
			sb.append(" ; rightButtonDescription = " + getRightButtonDescription());
			sb.append(" ; identifyRate = " + identifyRate);
			sb.append(" ; magicAttack " + magicAttack);
			return sb.toString();
		}

		@Override
		public int getId() {
			return id;
		}

		@Override
		public String getUnidentifyName() {
			return unidentifyName;
		}

		@Override
		public String getIdentifyName() {
			return identifyName;
		}

		@Override
		public int getBuyPrice() {
			return buyPrice;
		}

		@Override
		public int getSellPrice() {
			return sellPrice;
		}

		@Override
		public short getGroupSize() {
			return groupSize;
		}

		@Override
		public String getUseEffect() {
			return useEffect;
		}

		@Override
		public String getUseInit() {
			return useInit;
		}

		@Override
		public String getUseProcess() {
			return useProcess;
		}

		@Override
		public String getDropProcess() {
			return dropProcess;
		}

		@Override
		public String getPickupProcess() {
			return pickupProcess;
		}

		@Override
		public int getIconId() {
			return iconId;
		}

		@Override
		public byte getType() {
			return type;
		}

		@Override
		public boolean getDoubleHand() {
			return doubleHand;
		}

		@Override
		public boolean getCanDoubleClick() {
			return canDoubleClick;
		}

		@Override
		public byte getLevel() {
			return level;
		}

		@Override
		public boolean getIsPrecent() {
			return isPrecent;
		}

		@Override
		public Range<Short> getDurable() {
			return durable;
		}

		@Override
		public Range<Byte> getAttackCount() {
			return attackCount;
		}

		@Override
		public Range<Integer> getAttribute(String type, byte valueType) {
			return attributes.get(type, valueType);
		}

		@Override
		public Range<Byte> getLuck() {
			return luck;
		}

		@Override
		public byte getElementAttribute_1() {
			return elementAttribute_1;
		}

		@Override
		public byte getElementAttribute_2() {
			return elementAttribute_2;
		}

		@Override
		public byte getElementAttributeValue_1() {
			return elementAttributeValue_1;
		}

		@Override
		public byte getElementAttributeValue_2() {
			return elementAttributeValue_2;
		}

		@Override
		public short getSpecialType() {
			return specialType;
		}

		@Override
		public int[] getSubTypeParam() {
			return subTypeParam;
		}

		@Override
		public short getGemWeaponType() {
			return gemWeaponType;
		}

		@Override
		public short getGemArmorType() {
			return gemArmorType;
		}

		@Override
		public boolean getLogoutDispear() {
			return logoutDispear;
		}

		@Override
		public boolean getDropDispear() {
			return dropDispear;
		}

		@Override
		public boolean getCanPostByPet() {
			return canPostByPet;
		}

		@Override
		public boolean getCanComposite() {
			return canComposite;
		}

		@Override
		public String getDescription() {
			Message message = descriptionId == -1 ? null : messageManager.getMessage(descriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public String getRightButtonDescription() {
			Message message = rightButtonDescriptionId == -1 ? null : messageManager.getMessage(rightButtonDescriptionId);
			return message == null ? "" : message.getContent();
		}

		@Override
		public byte getIdentifyRate() {
			return identifyRate;
		}

		@Override
		public Range<Short> getMagicAttack() {
			return magicAttack;
		}

		@Override
		public ListMultimap<String, Byte> getAttributeTypes() {
			return attributeTypes;
		}

		@Override
		public boolean getCanUseInBattle() {
			return canUseInBattle;
		}
		
	}

	@Override
	public void output(File outFile, Collection<ItemTemplate> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
