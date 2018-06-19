package factory.ordinary.impl;

import factory.dto.Car;
import factory.dto.impl.BMW5;
import factory.ordinary.Factory;

public class BMW5Factory implements Factory{
	@Override
	public Car buyCar() {
		return new BMW5();
	}
}
