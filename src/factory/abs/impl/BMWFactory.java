package factory.abs.impl;

import factory.abs.AbstractFactory;
import factory.dto.Car;
import factory.dto.impl.*;

public class BMWFactory implements AbstractFactory{
	@Override
	public Car buyCar(String type) {
		switch (type) {
		case "5":
			return new BMW5();
		case "4":
			return new BMW4();
		default:
			return null;
		}
	}
}

