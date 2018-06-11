package state;

public class StateMain {
	public static void main(String[] args) {
		Work work = new Work();
		work.setState("New");
		work.speak();
		
		work.setState("Passed");
		work.speak();
	}
}
