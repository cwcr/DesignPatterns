package factory.ordinary;

import factory.dto.Car;
import factory.ordinary.impl.CatFactory;
import factory.ordinary.impl.DogFactory;

public class FactoryMain {//工厂模式
	public static void main(String[] args) {
		Factory catFactory = new CatFactory();
		Car cat = catFactory.getAnimal();
		cat.call();
		
		Factory dogFactory = new DogFactory();
		Car dog = dogFactory.getAnimal();
		dog.call();
	}
}
