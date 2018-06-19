package factory.sample;

import factory.dto.Car;

public class SampleFactoryMain {
	public static void main(String[] args) {
		Car cat = SampleFactory.getAnimal("cat");
		cat.call();
		
		Car dog = SampleFactory.getAnimal("dog");
		dog.call();
	}
}
