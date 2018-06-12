package memo;

public class Operator{
	private Memo memo;
	public Operator(Memo memo) {
		this.memo = memo;
	}
	
	void save(String text) {
		memo.push(text);
	}
	
	String undo() {
		return memo.pop();
	}
	
	private Operator() {
		memo = new Memo();
	}
	
	private static Operator operator = new Operator();
	
	public static Operator newInstance(){
		return operator;
	}
}
