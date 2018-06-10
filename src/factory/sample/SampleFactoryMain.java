package factory.sample;

import factory.dto.Animal;

public class SampleFactoryMain {
	public static void main(String[] args) {
		Animal cat = SampleFactory.getAnimal("cat");
		cat.call();
		
		Animal dog = SampleFactory.getAnimal("dog");
		dog.call();
	}
}
