package factory.abs;

import factory.abs.impl.BMWFactory;
import factory.abs.impl.BenzFactory;
import factory.dto.Car;

public class AbstractFactoryMain {
	public static void main(String[] args) throws ReflectiveOperationException {
		BMWFactory bmwFactory = new BMWFactory();
		Car bmw5 = bmwFactory.buyCar("5");
		bmw5.call();
		Car bmw4 = bmwFactory.buyCar("4");
		bmw4.call();
		
		BenzFactory benzFactory = new BenzFactory();
		Car benzE = benzFactory.buyCar("E");
		benzE.call();
		Car benzC = benzFactory.buyCar("C");
		benzC.call();
	}
}
