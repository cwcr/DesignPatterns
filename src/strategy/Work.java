package strategy;

public class Work {
  public static int calculate(int a,String symbol,int b) {
	  switch (symbol) {
		case "+":
			return new AddCalculate().calculate(a, b);
		case "-":
			return new SubCalculate().calculate(a, b);
		default:
			break;
	  }
	  return 0;
  }
}
