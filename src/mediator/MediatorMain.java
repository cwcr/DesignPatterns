package mediator;

public class MediatorMain {
	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		
		Observer observer1 = new Observer(mediator, "Observer1");
		Observer observer2 = new Observer(mediator, "Observer2");
		mediator.addObservers(observer1);
		mediator.addObservers(observer2);
		
		Subject subject1 = new Subject(mediator, "Subject1");
		Subject subject2 = new Subject(mediator, "Subject2");
		mediator.addSubject(subject1);
		mediator.addSubject(subject2);
		
		observer1.setMessage("状态变化");
		System.err.println();
		subject1.setMessage("状态变化");
	}
}
