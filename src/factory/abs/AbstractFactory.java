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
