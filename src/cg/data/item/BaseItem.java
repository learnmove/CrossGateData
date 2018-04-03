package cg.data.item;

import java.util.function.Function;

import cg.base.sprite.Attribute;

public interface BaseItem {
	
	byte NO_INSTANCE = -1;
	
	int getId();
	
	int getInstanceId();
	
	String getName();
	
	void setItemTemplate(ItemTemplate itemTemplate);
	
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
	
	boolean isValid();
	
	public static boolean same(BaseItem item1, BaseItem item2) {
		return item1.getId() == item2.getId() && item1.getInstanceId() == item2.getInstanceId();
	}
	
	public static boolean isValid(BaseItem item, Function<Byte, Byte> getEuipmentLevel) {
		ItemTemplate itemTemplate = item.getItemTemplate();
		byte supportLevel = getEuipmentLevel.apply(itemTemplate.getType());
		return supportLevel < 0 || supportLevel > itemTemplate.getLevel();
	}

}
