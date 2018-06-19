package factory.abs.impl;

import factory.abs.AbstractFactory;
import factory.dto.Car;
import factory.dto.impl.BenzC;
import factory.dto.impl.BenzE;

public class BenzFactory implements AbstractFactory{
	@Override
	public Car buyCar(String type) {
		switch (type) {
		case "E":
			return new BenzE();
		case "C":
			return new BenzC();
		default:
			return null;
		}
	}
}
