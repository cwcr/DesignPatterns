package factory.ordinary;

import factory.dto.Car;
import factory.ordinary.impl.*;
import factory.ordinary.impl.*;

public class FactoryMain {//����ģʽ
	public static void main(String[] args) {
		Factory bmw5Factory = new BMW5Factory();
		Car bmw5 = bmw5Factory.buyCar();
		bmw5.call();
		
		Factory bmw4Factory = new BMW4Factory();
		Car bmw4 = bmw4Factory.buyCar();
		bmw4.call();
	}
}
