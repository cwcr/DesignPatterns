package mediator;

public class Subject {
	private Mediator mediator;
	private String name;
	
	public Subject(Mediator mediator,String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
		System.err.println(name+message);
		mediator.noticeObserver(this.message);
	}
	
	public String getMessage() {
		return message;
	}
	
	public void speak() {
		System.err.println(name + "收到通知");
	}
}
