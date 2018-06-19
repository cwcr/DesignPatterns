package factory.sample;

import factory.dto.Car;
import factory.dto.impl.Cat;
import factory.dto.impl.BMW4;

public class SampleFactory {
	public static Car getAnimal(String type) {
		if(type.equalsIgnoreCase("cat")) {
			return new Cat();
		}else if(type.equalsIgnoreCase("dog")) {
			return new BMW4();
		}else {
			return null;
		}
	}
}
