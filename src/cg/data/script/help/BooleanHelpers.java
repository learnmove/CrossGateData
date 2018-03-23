package cg.data.script.help;

import java.util.Comparator;
import java.util.Map;

import com.google.common.collect.Maps;

import cg.data.script.antlr.GMSVParser;

public class BooleanHelpers {
	
	private static final Map<Integer, BooleanHelper<Boolean>> BOOLEAN_HELPERS = createBooleanHelper();
	
	private static Map<Integer, BooleanHelper<Boolean>> createBooleanHelper() {
		Map<Integer, BooleanHelper<Boolean>> map = Maps.newHashMap();
		map.put(GMSVParser.AND, new And());
		map.put(GMSVParser.OR, new Or());
		return map;
	}
	
	private static BooleanHelper<Boolean> getHelper(int type) {
		return BOOLEAN_HELPERS.containsKey(type) ? BOOLEAN_HELPERS.get(type) : BOOLEAN_HELPERS.get(GMSVParser.EQUAL);
	}
	
	public static Comparator<Boolean> getBooleanHelper(int type) {
		return BOOLEAN_HELPERS.containsKey(type) ? BOOLEAN_HELPERS.get(type) : BOOLEAN_HELPERS.get(GMSVParser.EQUAL);
	}
	
	public static boolean compare(int type, boolean o1, boolean o2) {
		return getHelper(type).logicCompare(o1, o2);
	}
	
	private static class And implements BooleanHelper<Boolean> {

		@Override
		public boolean logicCompare(Boolean o1, Boolean o2) {
			return o1 && o2;
		}
		
	}
	
	private static class Or implements BooleanHelper<Boolean> {

		@Override
		public boolean logicCompare(Boolean o1, Boolean o2) {
			return o1 || o2;
		}
		
	}

}
