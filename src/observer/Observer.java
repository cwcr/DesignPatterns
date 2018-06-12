package observer;

public abstract class Observer {
	protected Subject subject;
	
	abstract void update();
	
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	
	public Subject getSubject() {
		return subject;
	}
	
}
