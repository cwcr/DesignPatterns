package observer;

public class ObserverMain {
	public static void main(String[] args) {
		ExampleSubject subject = new ExampleSubject();
		subject.attach(new ExampleObserver(subject, "观察者一"));
		subject.attach(new ExampleObserver(subject, "观察者二"));
		
		subject.setStatus("老板来了");
	}
}
