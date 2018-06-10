package bulider.impl;

import bulider.Bulider;
import bulider.Buliding;

public class BuilderMethodB implements  Bulider{
	private Buliding buliding;
	
	public BuilderMethodB() {
		buliding = new Buliding();
	}

	@Override
	public void builderPartA() {
		buliding.add("top");
	}

	@Override
	public void builderPartB() {
		buliding.add("buttomB");
	}

	@Override
	public Buliding getResult() {
		return buliding;
	}
}
