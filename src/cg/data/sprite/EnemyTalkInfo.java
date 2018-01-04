package cg.data.sprite;

public interface EnemyTalkInfo {
	
	byte TALK_CONDITION_BATTLE_START = 1; // ս����ʼʱ
	
	byte TALK_CONDITION_ATTACK = 25; // ����ʱ
	
	byte TALK_CONDITION_DEFEND = 9; // ����ʱ
	
	byte TALK_CONDITION_USE_MAGIC = 11; // ʹ��ħ��ʱ
	
	byte TALK_CONDITION_DEAD = 13; // ����ʱ
	
	int getId();
	
	TalkInfo[] getTalkInfos();
	
	public static interface TalkInfo {
		
		byte getTalkCondition();
		
		int getTalkMsgId();
		
		byte getFontSize();
		
		short getFontColor();
		
	}

}
