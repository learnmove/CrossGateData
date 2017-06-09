package cg.data.job;

public interface Job {
	
	byte RANK_MAX = 10;
	
	byte STAGE_MAX = 4;
	
	short NO_JOB = 0;
	
	byte TYPE_BATTLE = 1;
	
	byte TYPE_PRODUCE = 2;
	
	String getName();
	
	short getId();
	
	byte getEuipmentLevel(byte type);
	
	short[] getPromotionSkillIds();
	
	byte getType();
	
	int getCost();
	
	int getFame();
	
	byte getPromotionSkillLevel(short skillId);

}
