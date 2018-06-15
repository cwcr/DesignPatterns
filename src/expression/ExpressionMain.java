package expression;

import expression.util.Expression;

public class ExpressionMain {
	public static void main(String[] args) {
		System.err.println(Expression.expression("1+2"));
		System.err.println(Expression.expression("1+2+4+5"));
		System.err.println(Expression.expression("1+2+4-5"));
	}
}
