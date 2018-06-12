package mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
	private List<Observer> observers;
	private List<Subject> subjects;

	public Mediator() {
		observers = new ArrayList<>();
		subjects = new ArrayList<>();
	}
	
	public void addObservers(Observer observer){
		observers.add(observer);
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public void noticeObserver(String message) {
		for (Observer observer : observers) {
			observer.speak();
		}
	}
	
	public void noticeSubject(String messsage) {
		for (Subject subject : subjects) {
			subject.speak();
		}
	}
}
