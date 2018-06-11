package state;

public class NewState implements State{
	@Override
	public void doSomething() {
		System.err.println("I'm a new Doc");
	}
}
