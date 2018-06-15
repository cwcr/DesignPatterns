package proxy;

public class ServiceProxy1 {
	private Service service = new Service();
	
	public void show(boolean canSelect) {
		if(canSelect) {
			System.out.println("获取数据库链接");
			service.show();
			System.out.println("释放链接");
		}
		else {
			System.out.println("没有查询权限！");
		}
	}
}
