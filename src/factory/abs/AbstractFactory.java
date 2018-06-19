package factory.abs;

import factory.dto.Car;

public class AbstractFactory {
	public static Car getAnimal(String type) throws ReflectiveOperationException {
		try {
			Class clazz = Class.forName(type);
			try {
				Object object = clazz.newInstance();
				if(object instanceof Car) {
					return (Car)object;
				}else {
					throw new IllegalAccessException("����Animal�����");
				}
			} catch (InstantiationException | IllegalAccessException e) {
				// �޷���ʼ����
				throw e;
			}
		} catch (ClassNotFoundException e) {
			// �಻����
			throw e;
		}
	}
	
}
