package single;

public class SingleMain {//µ¥ÀýÄ£Ê½
	public static void main(String[] args) {
		LazySingle lazySingle1 = LazySingle.newInstance();
		LazySingle lazySingle2 = LazySingle.newInstance();
		System.err.println(lazySingle1 == lazySingle2);
		
		HungrySingle hungrySingle1 = HungrySingle.newInstance();
		HungrySingle hungrySingle2 = HungrySingle.newInstance();
		System.err.println(hungrySingle1 == hungrySingle2);
	}
}
