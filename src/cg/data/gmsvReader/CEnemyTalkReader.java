package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfEnemyTalk;
import cg.base.loader.IOCBeanType;
import cg.data.sprite.EnemyTalkInfo;
import cg.data.sprite.EnemyTalkInfo.TalkInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyTalkReader extends BaseObjectReader<EnemyTalkInfo, ConfEnemyTalk> {
	
	private static class CTalkInfo implements TalkInfo {
		
		private byte talkCondition;
		
		private int talkMsgId;
		
		private byte fontSize;
		
		private short fontColor;
		
		public CTalkInfo(byte talkCondition, int talkMsgId, byte fontSize, short fontColor) {
			this.talkCondition = talkCondition;
			this.talkMsgId = talkMsgId;
			this.fontSize = fontSize;
			this.fontColor = fontColor;
		}

		@Override
		public byte getTalkCondition() {
			return talkCondition;
		}

		@Override
		public int getTalkMsgId() {
			return talkMsgId;
		}

		@Override
		public byte getFontSize() {
			return fontSize;
		}

		@Override
		public short getFontColor() {
			return fontColor;
		}
		
	}
	
	private static class CEnemyTalkInfo implements EnemyTalkInfo {
		
		private int id;
		
		private TalkInfo[] talkInfos;

		@Override
		public int getId() {
			return id;
		}

		@Override
		public TalkInfo[] getTalkInfos() {
			return talkInfos;
		}
		
	}

	@Override
	public void output(File outFile, Collection<EnemyTalkInfo> collection)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	Class<ConfEnemyTalk> getFromClass() {
		return ConfEnemyTalk.class;
	}

	@Override
	EnemyTalkInfo transform(ConfEnemyTalk s) {
		CEnemyTalkInfo ret = new CEnemyTalkInfo();
		ret.id = s.getId();
		byte[] conditions = s.getTalkConditions();
		int[] msgIds = s.getTalkMsgIds();
		byte[] fontSizes = s.getFontSizes();
		short[] fontColors = s.getFontColors();
		ret.talkInfos = new TalkInfo[conditions.length];
		for (int i = 0;i < conditions.length;i++) {
			ret.talkInfos[i] = new CTalkInfo(conditions[i], msgIds[i], fontSizes[i], fontColors[i]);
		}
		return ret;
	}

}
