package expression.util;

import java.util.Arrays;

import expression.factory.SymbolFactory;
import expression.symbol.Symbol;
import expression.bean.ExpressionResult;

public class Expression {
	public static long expression(String operation) {
		if(operation!=null) {
			return expression(operation.toCharArray());
		}
		return 0;
	}
	
	public static long expression(char[] cs) {
		long left = 0;
		if(cs!=null&&cs.length>0) {
			ExpressionResult result = SymbolUtil.getLong(cs);
			left = result.getResult();
			cs = result.getCs();
			while (cs.length>0) {
				Symbol symbol;
				try {
					symbol = SymbolFactory.getInstance(cs[0], left);
					cs = Arrays.copyOfRange(cs, 1, cs.length);
					result = symbol.calculator(cs);
					cs = result.getCs();
					left = result.getResult();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return left;
	}
	
}
