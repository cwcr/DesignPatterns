package factory.ordinary;

import factory.dto.Animal;
import factory.ordinary.impl.CatFactory;
import factory.ordinary.impl.DogFactory;

public class FactoryMain {//工厂模式
	public static void main(String[] args) {
		Factory catFactory = new CatFactory();
		Animal cat = catFactory.getAnimal();
		cat.call();
		
		Factory dogFactory = new DogFactory();
		Animal dog = dogFactory.getAnimal();
		dog.call();
	}
}
