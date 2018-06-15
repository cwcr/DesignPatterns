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
		
		System.out.println("-------------修改装饰的顺序-----------");
		coffee = new Coffee();
		milk.decorator(coffee);
		coffee.show();
		suger.decorator(coffee);
		coffee.show();
		
		System.out.println("-------------装饰其他的类型-----------");
		Tea tea = new Tea();
		milk.decorator(tea);
		tea.show();
		suger.decorator(tea);
		tea.show();
		
	}
}
