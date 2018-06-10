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
					throw new IllegalAccessException("不是Animal类对象");
				}
			} catch (InstantiationException | IllegalAccessException e) {
				// 无法初始化类
				throw e;
			}
		} catch (ClassNotFoundException e) {
			// 类不存在
			throw e;
		}
	}
	
}
