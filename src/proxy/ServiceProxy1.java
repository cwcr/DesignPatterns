package proxy;

public class ServiceProxy1 {
	private Service service = new Service();
	
	public void show(boolean canSelect) {
		if(canSelect) {
			System.out.println("��ȡ���ݿ�����");
			service.show();
			System.out.println("�ͷ�����");
		}
		else {
			System.out.println("û�в�ѯȨ�ޣ�");
		}
	}
}
