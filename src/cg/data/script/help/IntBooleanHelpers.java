package cg.data.script.help;

import java.util.Comparator;
import java.util.Map;

import com.google.common.collect.Maps;

import cg.data.script.antlr.GMSVParser;

public class IntBooleanHelpers {
	
	private static final Map<Integer, BooleanHelper<Integer>> BOOLEAN_HELPERS = createBooleanHelper();
	
	private static Map<Integer, BooleanHelper<Integer>> createBooleanHelper() {
		Map<Integer, BooleanHelper<Integer>> map = Maps.newHashMap();
		map.put(GMSVParser.NOTEQUAL1, new NotEqual());
		map.put(GMSVParser.NOTEQUAL2, map.get(GMSVParser.NOTEQUAL1));
		map.put(GMSVParser.LESSTHANOREQUALTO, new LessThanOrEqual());
		map.put(GMSVParser.LESSTHAN, new LessThan());
		map.put(GMSVParser.GREATERTHANOREQUALTO, new GreaterThanOrEqual());
		map.put(GMSVParser.GREATERTHAN, new GreaterThan());
		map.put(GMSVParser.EQUAL, new Equal());
		return map;
	}
	
	private static BooleanHelper<Integer> getHelper(int type) {
		return BOOLEAN_HELPERS.containsKey(type) ? BOOLEAN_HELPERS.get(type) : BOOLEAN_HELPERS.get(GMSVParser.EQUAL);
	}
	
	public static Comparator<Integer> getBooleanHelper(int type) {
		return BOOLEAN_HELPERS.containsKey(type) ? BOOLEAN_HELPERS.get(type) : BOOLEAN_HELPERS.get(GMSVParser.EQUAL);
	}
	
	public static boolean compare(int type, int o1, int o2) {
		return getHelper(type).logicCompare(o1, o2);
	}
	
	private static class NotEqual implements BooleanHelper<Integer> {

		@Override
		public boolean logicCompare(Integer o1, Integer o2) {
			return o1 != o2;
		}
		
	}
	
	private static class LessThanOrEqual implements BooleanHelper<Integer> {

		@Override
		public boolean logicCompare(Integer o1, Integer o2) {
			return o1 <= o2;
		}
		
	}
	
	private static class LessThan implements BooleanHelper<Integer> {

		@Override
		public boolean logicCompare(Integer o1, Integer o2) {
			return o1 < o2;
		}
		
	}
	
	private static class GreaterThanOrEqual implements BooleanHelper<Integer> {

		@Override
		public boolean logicCompare(Integer o1, Integer o2) {
			return o1 >= o2;
		}
		
	}
	
	private static class GreaterThan implements BooleanHelper<Integer> {

		@Override
		public boolean logicCompare(Integer o1, Integer o2) {
			return o1 > o2;
		}
		
	}
	
	private static class Equal implements BooleanHelper<Integer> {

		@Override
		public boolean logicCompare(Integer o1, Integer o2) {
			return o1 == o2;
		}
		
	}

}
