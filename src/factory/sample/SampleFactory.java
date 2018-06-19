package factory.sample;

import factory.dto.Car;
import factory.dto.impl.*;
import factory.dto.impl.BMW4;

public class SampleFactory {
	public static Car buyCar(String type) {
		if(type.equalsIgnoreCase("BenzC")) {
			return new BenzC();
		}else if(type.equalsIgnoreCase("BenzE")) {
			return new BenzE();
		}else {
			return null;
		}
	}
}
