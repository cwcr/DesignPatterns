package share;

import java.util.HashMap;

public class MyIntegerPool {
	private static MyInteger[] myIntegers;
	
	static {
		myIntegers = new MyInteger[MyInteger.MAX_CACHE-MyInteger.MIN_CACHE+1];
		for(int i = MyInteger.MIN_CACHE;i<MyInteger.MAX_CACHE;i++) {
			myIntegers[i] = new MyInteger(i);
		}
	}
	
	public static MyInteger getMyInteger(int i) {
		return myIntegers[i];
	}
}
