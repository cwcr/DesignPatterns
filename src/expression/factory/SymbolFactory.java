package expression.factory;

import expression.symbol.Symbol;
import expression.symbol.impl.AddSymbol;
import expression.symbol.impl.SubSymbol;

public class SymbolFactory {
	public static Symbol getInstance(char cs,long left) throws Exception {
		switch (cs) {
		case '-':
			return new SubSymbol(left);
		case '+':
			return new AddSymbol(left);
		default:
			throw new Exception("不存在此符号的解释器");
		}
	}
}
