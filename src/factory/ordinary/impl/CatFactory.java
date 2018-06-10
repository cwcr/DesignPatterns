package factory.ordinary.impl;

import factory.dto.Animal;
import factory.dto.impl.Cat;
import factory.ordinary.Factory;

public class CatFactory implements Factory{
	@Override
	public Animal getAnimal() {
		return new Cat();
	}
}
