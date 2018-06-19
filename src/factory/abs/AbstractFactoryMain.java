package factory.abs;

import factory.dto.Car;

public class AbstractFactoryMain {
	public static void main(String[] args) throws ReflectiveOperationException {
		Car cat = AbstractFactory.getAnimal("factory.dto.impl.Cat");
		cat.call();
		
		Car dog = AbstractFactory.getAnimal("factory.dto.impl.BMW4");
		dog.call();
		
		Car sheep = AbstractFactory.getAnimal("factory.dto.impl.BenzE");
		sheep.call();
	}
}
