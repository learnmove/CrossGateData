package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfEnemyAI;
import cg.base.loader.IOCBeanType;
import cg.data.ai.EnemyAiInfo;
import cg.data.ai.EnemyAiInfo.AiInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyAiReader extends BaseObjectReader<EnemyAiInfo, ConfEnemyAI> {
	
	private static class CAiInfo implements AiInfo {
		
		private byte condition;
		
		private byte targetType;
		
		private int skillCode;
		
		private byte hitRate;
		
		public CAiInfo(byte condition, byte targetType, int skillCode, byte hitRate) {
			this.condition = condition;
			this.targetType = targetType;
			this.skillCode = skillCode;
			this.hitRate = hitRate;
		}

		@Override
		public byte getCondition() {
			return condition;
		}

		@Override
		public byte getTargetType() {
			return targetType;
		}

		@Override
		public int getSkillCode() {
			return skillCode;
		}

		@Override
		public byte getRate() {
			return hitRate;
		}
		
	}
	
	private static class CEnemyAiInfo implements EnemyAiInfo {
		
		private int id;
		
		private AiInfo[] aiInfos;

		@Override
		public int getId() {
			return id;
		}

		@Override
		public AiInfo[] getAiInfos() {
			return aiInfos;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyAiInfo> collection) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected Class<ConfEnemyAI> getFromClass() {
		return ConfEnemyAI.class;
	}

	@Override
	protected EnemyAiInfo transform(ConfEnemyAI s) {
		CEnemyAiInfo ret = new CEnemyAiInfo();
		ret.id = s.getId();
		byte[] conditions = s.getConditions();
		byte[] targetTypes = s.getTargetTypes();
		int[] skillCodes = s.getSkillCodes();
		byte[] hitRates = s.getHitRates();
		ret.aiInfos = new AiInfo[conditions.length];
		for (int i = 0;i < conditions.length;i++) {
			if (hitRates[i] > 0) {
				ret.aiInfos[i] = new CAiInfo(conditions[i], targetTypes[i], skillCodes[i], hitRates[i]);
			}
		}
		return ret;
	}

}
