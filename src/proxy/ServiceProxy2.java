package proxy;

public class ServiceProxy2 extends Service{
	public void show(boolean canSelect) {
		if(canSelect) {
			System.out.println("��ȡ���ݿ�����");
			System.out.println("��ȡ");
			System.out.println("�ͷ�����");
		}
		else {
			System.out.println("û�в�ѯȨ�ޣ�");
		}
	}
	
	public void show() {
		show(false);
	}
}
