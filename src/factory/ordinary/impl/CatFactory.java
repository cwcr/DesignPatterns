package factory.ordinary.impl;

import factory.dto.Car;
import factory.dto.impl.Cat;
import factory.ordinary.Factory;

public class CatFactory implements Factory{
	@Override
	public Car getAnimal() {
		return new Cat();
	}
}
