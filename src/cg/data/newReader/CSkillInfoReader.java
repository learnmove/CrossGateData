package cg.data.newReader;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import cg.base.skill.SkillLevelData;
import cg.base.skill.SkillTemplate;
import cg.base.sprite.AttributeCell;
import cg.base.util.MathUtil;
import cg.data.gmsvReader.CSkillDataReader.CSelfEffect;
import cg.data.gmsvReader.CSkillDataReader.CSkillData;
import cg.data.gmsvReader.CSkillTemplateReader.CSkillTemplate;
import cg.data.resource.MessageManager;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;

//@IOCBean(type=IOCBeanType.READER)
public class CSkillInfoReader implements ObjectReader<SkillTemplate> {

	@Override
	public List<SkillTemplate> read(ProjectData projectData) {
		Document doc = projectData.getXmlResource("skills");
		if (doc != null) {
			Element root = doc.getRootElement();
			List<Element> list = root.getChildren("skill");
			List<SkillTemplate> ret = Lists.newArrayListWithCapacity(list.size());
			for (int i = 0;i < list.size();i++) {
				Element element = list.get(i);
				ret.add(new CSkillInfo(element, projectData.getMessageManager()));
			}
			return ret;
		} else {
			return Lists.newLinkedList();
		}
	}
	
	protected static class CSkillInfo extends CSkillTemplate {
		
		private Map<Integer, SkillLevelData> skillLevelDatas;
		
		private CSkillInfo(Element element, MessageManager messageManager) {
			attributeCells = Maps.newHashMap();
			name = element.getAttributeValue("name");
			id = MathUtil.stringToShort(element.getAttributeValue("id"));
			studyPrice = MathUtil.stringToShort(element.getAttributeValue("studyPrice"));
			needWeaponType = MathUtil.stringToShort(element.getAttributeValue("needWeaponType"));
			notGainExp = Boolean.parseBoolean(element.getAttributeValue("notGainExp"));
			doubleExpType = MathUtil.stringToShort(element.getAttributeValue("doubleExpType"));
			priceRate = MathUtil.stringToShort(element.getAttributeValue("priceRate"));
			descriptionId = MathUtil.stringToInt(element.getAttributeValue("description"), -1);
			type = Byte.parseByte(element.getAttributeValue("type"));
			useSpace = Byte.parseByte(element.getAttributeValue("useSpace"));
			expType = Byte.parseByte(element.getAttributeValue("expType"));
			effectWorkLevel = Byte.parseByte(element.getAttributeValue("effectWorkLevel"));
			
			List<Element> attributeList = element.getChildren("attribute");
			for (int i = 0;i < attributeList.size();i++) {
				Element child = attributeList.get(i);
				String attributeType = child.getAttributeValue("attributeType");
				if (!attributeCells.containsKey(attributeType)) {
					attributeCells.put(attributeType, new AttributeCell(attributeType));
				}
				byte type = Byte.parseByte(element.getAttributeValue("type"));
				int value = Integer.parseInt(element.getAttributeValue("value"));
				attributeCells.get(attributeType).setValue(type, value);
			}
			
			skillLevelDatas = Maps.newHashMap();
			List<Element> dataList = element.getChildren("attribute");
			for (int i = 0;i < dataList.size();i++) {
				Element child = dataList.get(i);
				SkillLevelData data = new CSkillLevelData(child, id, messageManager);
				skillLevelDatas.put(data.getSkillCode(), data);
			}
		}

		@Override
		public SkillLevelData getSkillData(int skillCode) {
			return skillLevelDatas.get(skillCode);
		}

		@Override
		public Collection<SkillLevelData> getSkillDatas() {
			return skillLevelDatas.values();
		}
		
	}
	
	protected static class CSkillLevelData extends CSkillData implements SkillLevelData {
		
		protected int beginAnimation, attachAnimation, hitAnimation, backAnimation, trackAnimation;
		
		private CSkillLevelData(Element element, short skillId, MessageManager messageManager) {
			name = element.getAttributeValue("name");
			techType = element.getAttributeValue("tech");
			skillCode = MathUtil.stringToInt(element.getAttributeValue("skillCode"));
			beginAnimation = MathUtil.stringToInt(element.getAttributeValue("beginAnimation"));
			attachAnimation = MathUtil.stringToInt(element.getAttributeValue("attachAnimation"));
			hitAnimation = MathUtil.stringToInt(element.getAttributeValue("hitAnimation"));
			backAnimation = MathUtil.stringToInt(element.getAttributeValue("backAnimation"));
			trackAnimation = MathUtil.stringToInt(element.getAttributeValue("trackAnimation"));
			descriptionId = MathUtil.stringToInt(element.getAttributeValue("description"), -1);
			this.skillId = skillId;
			level = MathUtil.stringToByte(element.getAttributeValue("level"));
			useSpace = MathUtil.stringToByte(element.getAttributeValue("useSpace"));
			targetType = MathUtil.stringToShort(element.getAttributeValue("targetType"));
			price = MathUtil.stringToInt(element.getAttributeValue("price"));
			costMp = MathUtil.stringToShort(element.getAttributeValue("costMp"));
			
			List<Element> effectList = element.getChildren("effect");
			selfEffects = new SelfEffect[effectList.size()];
			for (int i = 0;i < effectList.size();i++) {
				Element child = effectList.get(i);
				String type = child.getAttributeValue("type");
				short value = MathUtil.stringToShort(element.getAttributeValue("value"));
				selfEffects[i] = new CSelfEffect(type, value, this);
			}
			
			List<Element> produceList = element.getChildren("produce");
			produces = new short[produceList.size()];
			for (int i = 0;i < produceList.size();i++) {
				produces[i] = Short.parseShort(produceList.get(i).getAttributeValue("id"));
			}
		}

		@Override
		public int getBeginAnimation() {
			return beginAnimation;
		}

		@Override
		public int getAttachAnimation() {
			return attachAnimation;
		}

		@Override
		public int getHitAnimation() {
			return hitAnimation;
		}

		@Override
		public int getBackAnimation() {
			return backAnimation;
		}

		@Override
		public int getTrackAnimation() {
			return trackAnimation;
		}
		
	}

	@Override
	public void output(File outFile, Collection<SkillTemplate> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
