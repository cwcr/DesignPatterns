package share;

public class MyInteger {
	private int value;
	
	public final static int MIN_CACHE = 0;
	public final static int MAX_CACHE = 15;

	public MyInteger(int i) {
		this.value = i;
	}
	
	public static MyInteger valueOf(int i) {
		if(i>=MIN_CACHE&&i<=MAX_CACHE) {
			return MyIntegerPool.getMyInteger(i);
		}
		return new MyInteger(i);
	}
}
