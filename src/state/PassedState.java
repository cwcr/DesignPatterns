package state;

public class PassedState implements State{
	@Override
	public void doSomething() {
		System.err.println("I'm a passed Doc");
	}
}
