package expression.symbol;

import expression.bean.ExpressionResult;

public abstract class Symbol {
	protected long left;
	protected long right;
	
	protected Symbol(long left) {
		this.left = left;
	}
	
	public abstract ExpressionResult calculator(char[] cs);
}
