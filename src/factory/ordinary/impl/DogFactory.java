package factory.ordinary.impl;

import factory.dto.Car;
import factory.dto.impl.BMW4;
import factory.ordinary.Factory;

public class DogFactory implements Factory{
	@Override
	public Car getAnimal() {
		return new BMW4();
	}
}
