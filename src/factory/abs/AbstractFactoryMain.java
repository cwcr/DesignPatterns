package factory.abs;

import factory.dto.Animal;

public class AbstractFactoryMain {
	public static void main(String[] args) throws ReflectiveOperationException {
		Animal cat = AbstractFactory.getAnimal("factory.dto.impl.Cat");
		cat.call();
		
		Animal dog = AbstractFactory.getAnimal("factory.dto.impl.Dog");
		dog.call();
		
		Animal sheep = AbstractFactory.getAnimal("factory.dto.impl.Sheep");
		sheep.call();
	}
}
