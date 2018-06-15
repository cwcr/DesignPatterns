package decorater.spices.impl;

import decorater.bean.Coffee;
import decorater.bean.Drinks;
import decorater.bean.Tea;
import decorater.spices.Spices;

public class Milk extends Spices{

	public Milk() {
		super("��");
	}

	@Override
	public void decorator(Drinks drinks) {
		if(drinks instanceof Coffee) {
			drinks.setName("����");
		}else if (drinks instanceof Tea) {
			drinks.setName("�̲�");
		}else {
			super.decorator(drinks);
		}
	}
	
}
