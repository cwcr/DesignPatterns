package factory.dto.impl;

import factory.dto.Car;

public class BenzE extends Car{
	@Override
	public void call() {
		System.out.println("I'm a BenzE");
	}
}
