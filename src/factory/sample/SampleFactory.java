package factory.sample;

import factory.dto.Animal;
import factory.dto.impl.Cat;
import factory.dto.impl.Dog;

public class SampleFactory {
	public static Animal getAnimal(String type) {
		if(type.equalsIgnoreCase("cat")) {
			return new Cat();
		}else if(type.equalsIgnoreCase("dog")) {
			return new Dog();
		}else {
			return null;
		}
	}
}
