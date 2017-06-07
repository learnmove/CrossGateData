package cg.data.item;

import cg.base.sprite.Attribute;

public interface BaseItem {
	
	byte NO_INSTANCE = -1;
	
	int getId();
	
	int getInstanceId();
	
	String getName();
	
	ItemTemplate getItemTemplate();
	
	void modifyCount(int count);
	
	int getCount();
	
	int getAttribute(String type, byte valueType);
	
	Attribute getAttribute();
	
	byte getLuck();
	
	short getMagicAttack();
	
	boolean getIdentify();
	
	boolean identify();
	
	int getStampCount();
	
	void addStampCount(int stampCount);

}
