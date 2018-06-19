package factory.sample;

import factory.dto.Car;

public class SampleFactoryMain {
	public static void main(String[] args) {
		Car cat = SampleFactory.buyCar("BenzC");
		cat.call();
		
		Car dog = SampleFactory.buyCar("BenzE");
		dog.call();
	}
}
