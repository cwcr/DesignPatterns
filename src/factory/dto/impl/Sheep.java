package factory.dto.impl;

import factory.dto.Animal;

public class Sheep extends Animal{
	@Override
	public void call() {
		System.out.println("I'm a sheep");
	}
}
