package decorater.spices.impl;

import decorater.bean.Coffee;
import decorater.bean.Drinks;
import decorater.bean.Tea;
import decorater.spices.Spices;

public class Milk extends Spices{

	public Milk() {
		super("ÄÌ");
	}

	@Override
	public void decorator(Drinks drinks) {
		if(drinks instanceof Coffee) {
			drinks.setName("ÄÃÌת");
		}else if (drinks instanceof Tea) {
			drinks.setName("ÄÌ²ט");
		}else {
			super.decorator(drinks);
		}
	}
	
}
