package factory.ordinary.impl;

import factory.dto.Animal;
import factory.dto.impl.Dog;
import factory.ordinary.Factory;

public class DogFactory implements Factory{
	@Override
	public Animal getAnimal() {
		return new Dog();
	}
}
