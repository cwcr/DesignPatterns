package state;

public class Work {
	private String state;
	
	private State thisState;
	
	public String getState() {
		return state;
	}
	
	public Work setState(String state) {
		this.state = state;
		return this;
	}
	
	public void speak() {
		thisState = null;
		StringBuilder sb = new StringBuilder("state.");
		sb.append(state);
		sb.append("State");
		try {
			thisState = (State) Class.forName(sb.toString()).newInstance();
			thisState.doSomething();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
