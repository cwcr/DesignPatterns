package factory.ordinary.impl;

import factory.dto.Car;
import factory.ordinary.Factory;
import factory.dto.impl.*;

public class BMW4Factory implements Factory{
	@Override
	public Car buyCar() {
		return new BMW4();
	}
}
