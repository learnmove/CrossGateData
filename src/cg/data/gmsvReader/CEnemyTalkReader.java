package cg.data.gmsvReader;

import java.io.File;
import java.util.Collection;
import java.util.List;

import org.tool.server.ioc.IOCBean;

import cg.base.conf.ConfEnemyTalk;
import cg.base.conf.IConfEnemyTalk;
import cg.base.loader.IOCBeanType;
import cg.data.resource.ObjectReader;
import cg.data.resource.ProjectData;
import cg.data.sprite.EnemyTalkInfo;
import cg.data.sprite.EnemyTalkInfo.TalkInfo;

@IOCBean(type=IOCBeanType.READER)
class CEnemyTalkReader implements ObjectReader<EnemyTalkInfo> {

	@Override
	public List<EnemyTalkInfo> read(ProjectData projectData) {
		return ObjectReader.transform(ConfEnemyTalk.arrayFromExcel(projectData), s -> { return new CEnemyTalkInfo(s); });
	}
	
	private static class CTalkInfo implements TalkInfo {
		
		private byte talkCondition;
		
		private int talkMsgId;
		
		private byte fontSize;
		
		private byte fontColor;
		
		public CTalkInfo(byte talkCondition, int talkMsgId, byte fontSize, byte fontColor) {
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
		public byte getFontColor() {
			return fontColor;
		}
		
	}
	
	private static class CEnemyTalkInfo implements EnemyTalkInfo {
		
		private int id;
		
		private TalkInfo[] talkInfos;
		
		public CEnemyTalkInfo(IConfEnemyTalk conf) {
			id = conf.getId();
			byte[] conditions = conf.getTalkConditions();
			int[] msgIds = conf.getTalkMsgIds();
			byte[] fontSizes = conf.getFontSizes();
			byte[] fontColors = conf.getFontColors();
			talkInfos = new TalkInfo[conditions.length];
			for (int i = 0;i < conditions.length;i++) {
				talkInfos[i] = new CTalkInfo(conditions[i], msgIds[i], fontSizes[i], fontColors[i]);
			}
		}

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

}
