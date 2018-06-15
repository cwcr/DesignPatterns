package proxy;

public class ServiceProxy2 extends Service{
	public void show(boolean canSelect) {
		if(canSelect) {
			System.out.println("获取数据库链接");
			System.out.println("获取");
			System.out.println("释放链接");
		}
		else {
			System.out.println("没有查询权限！");
		}
	}
	
	public void show() {
		show(false);
	}
}
