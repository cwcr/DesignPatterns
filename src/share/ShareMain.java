package share;

public class ShareMain {
	public static void main(String[] args) {
		MyInteger myInteger = MyInteger.valueOf(15);
		MyInteger myInteger1 = MyInteger.valueOf(15);
		MyInteger myInteger2 = new MyInteger(15);
		System.out.println(myInteger == myInteger1);
		System.out.println(myInteger == myInteger2);
		
//		MyInteger myInteger = MyInteger.valueOf(16);
//		MyInteger myInteger1 = MyInteger.valueOf(16);
//		MyInteger myInteger2 = new MyInteger(16);
//		System.out.println(myInteger == myInteger1);
//		System.out.println(myInteger == myInteger2);
		
//		Integer integer = Integer.valueOf(127);
//		Integer integer1 = Integer.valueOf(127);
//		System.out.println(integer == integer1);
		
//		Integer integer = Integer.valueOf(128);
//		Integer integer1 = Integer.valueOf(128);
//		System.out.println(integer == integer1);
		
//		Long long1 = Long.valueOf(127L);
//		Long long2 = Long.valueOf(127L);
//		System.out.println(long1 == long2);
		
//		Long long1 = Long.valueOf(128L);
//		Long long2 = Long.valueOf(128L);
//		System.out.println(long1 == long2);
	}
}
