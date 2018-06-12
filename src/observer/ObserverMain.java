package observer;

public class ObserverMain {
	public static void main(String[] args) {
		ExampleSubject subject = new ExampleSubject();
		subject.attach(new ExampleObserver(subject, "�۲���һ"));
		subject.attach(new ExampleObserver(subject, "�۲��߶�"));
		
		subject.setStatus("�ϰ�����");
	}
}
