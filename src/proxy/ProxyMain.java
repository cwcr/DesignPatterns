package proxy;

public class ProxyMain {
	public static void main(String[] args) {
		System.out.println("�ۺϷ�ʽʵ�ִ���ģʽ");
		ServiceProxy1 serviceProxy1 = new ServiceProxy1();
		System.out.println("---û�в�ѯȨ��-----");
		serviceProxy1.show(false);
		System.out.println("---�в�ѯȨ��-----");
		serviceProxy1.show(true);
		
		System.out.println();
		
		System.out.println("�̳з�ʽʵ�ִ���ģʽ");
		ServiceProxy2 serviceProxy2 = new ServiceProxy2();
		System.out.println("---��д�������Ʋ�ѯȨ��-----");
		serviceProxy2.show();
		System.out.println("---�в�ѯȨ��-----");
		serviceProxy2.show(true);
	}
}
