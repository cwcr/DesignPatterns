package decorater;

import decorater.bean.Coffee;
import decorater.bean.Tea;
import decorater.spices.impl.Milk;
import decorater.spices.impl.Suger;

public class DecoraterMain {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		
		Suger suger = new Suger();
		Milk milk = new Milk();
		
		suger.decorator(coffee);
		coffee.show();
		milk.decorator(coffee);
		coffee.show();
		
		System.out.println("-------------�޸�װ�ε�˳��-----------");
		coffee = new Coffee();
		milk.decorator(coffee);
		coffee.show();
		suger.decorator(coffee);
		coffee.show();
		
		System.out.println("-------------װ������������-----------");
		Tea tea = new Tea();
		milk.decorator(tea);
		tea.show();
		suger.decorator(tea);
		tea.show();
		
	}
}
