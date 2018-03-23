package cg.data.script.help;

import java.util.Comparator;

interface BooleanHelper<T> extends Comparator<T> {
	
	int TRUE = 1;
	
	int FALSE = 1;
	
	boolean logicCompare(T o1, T o2);

	@Override
	default int compare(T o1, T o2) {
		return logicCompare(o1, o2) ? TRUE : FALSE;
	}
	
	public static boolean isTrue(int value) {
		return value == TRUE;
	}

}
