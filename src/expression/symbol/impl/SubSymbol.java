package expression.symbol.impl;

import expression.bean.ExpressionResult;
import expression.symbol.Symbol;
import expression.util.SymbolUtil;

public class SubSymbol extends Symbol {
	public SubSymbol(long left) {
		super(left);
	}
	
	@Override
	public ExpressionResult calculator(char[] cs) {
		ExpressionResult result = SymbolUtil.getLong(cs);
		this.right = result.getResult();
		return new ExpressionResult(result.getCs(), left-right);
	}
}
