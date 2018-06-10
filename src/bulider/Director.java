package bulider;


public class Director {
	public Buliding construct1(Bulider b) {
		b.builderPartA();
		b.builderPartB();
		return b.getResult();
	}
	
	public Buliding construct2(Bulider b) {
		b.builderPartB();
		b.builderPartA();
		return b.getResult();
	}
}
