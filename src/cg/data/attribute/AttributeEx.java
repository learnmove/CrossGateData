package cg.data.attribute;

import com.alibaba.fastjson.annotation.JSONField;

import cg.base.sprite.Attribute;

public interface AttributeEx extends Attribute {
	
	byte SOUL_MAX = 5;
	
	byte INJURED_MAX = 4;
	@JSONField(serialize=false, deserialize=false)
	void setBirthData(BirthData birthData);
	@JSONField(serialize=false, deserialize=false)
	BirthData getBirthData();
	@JSONField(serialize=false, deserialize=false)
	void setAttributeCalculator(AttributeCalculator attributeCalculator);
	
	void calculator();
	
	AttributeEx clone();
	
	public static interface AttributeCalculator {
		
		void calculator(AttributeEx attribute);
		
	}

}
