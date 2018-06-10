package factory.abs;

import factory.dto.Animal;

public class AbstractFactory {
	public static Animal getAnimal(String type) throws ReflectiveOperationException {
		try {
			Class clazz = Class.forName(type);
			try {
				Object object = clazz.newInstance();
				if(object instanceof Animal) {
					return (Animal)object;
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
