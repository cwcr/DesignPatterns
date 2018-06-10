package bulider.impl;

import bulider.Bulider;
import bulider.Buliding;

public class BuilderMethodA implements Bulider{
	private Buliding buliding;

	public BuilderMethodA() {
		buliding = new Buliding();
	}
	
	public void builderPartA() {
		buliding.add("bottomA");
	}

	public void builderPartB() {
		buliding.add("topA");
	}

	@Override
	public Buliding getResult() {
		return buliding;
	}

}
