package proxy;

public class ProxyMain {
	public static void main(String[] args) {
		System.out.println("聚合方式实现代理模式");
		ServiceProxy1 serviceProxy1 = new ServiceProxy1();
		System.out.println("---没有查询权限-----");
		serviceProxy1.show(false);
		System.out.println("---有查询权限-----");
		serviceProxy1.show(true);
		
		System.out.println();
		
		System.out.println("继承方式实现代理模式");
		ServiceProxy2 serviceProxy2 = new ServiceProxy2();
		System.out.println("---重写方法控制查询权限-----");
		serviceProxy2.show();
		System.out.println("---有查询权限-----");
		serviceProxy2.show(true);
	}
}
