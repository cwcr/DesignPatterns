package expression.util;

import java.util.Arrays;

import expression.bean.ExpressionResult;

public class SymbolUtil {
	public static ExpressionResult getLong(char[] cs) {
		StringBuilder stringBuilder = new StringBuilder();
		int i = 0;
		for (char c : cs) {
			if(c>=48&&c<=57) {
				i++;
				stringBuilder.append(c);
			}else {
				break;
			}
		}
		return new ExpressionResult(Arrays.copyOfRange(cs, i, cs.length), Long.parseLong(stringBuilder.toString()));
	}
}	
