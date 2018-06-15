package expression.bean;

public class ExpressionResult {
	private char[] cs;
	private long result;
	
	public ExpressionResult(char[] cs,long result) {
		this.cs = cs;
		this.result = result;
	}
	
	public char[] getCs() {
		return cs;
	}
	
	public long getResult() {
		return result;
	}
}
