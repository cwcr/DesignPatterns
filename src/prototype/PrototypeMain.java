package prototype;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.SerializationUtils;

public class PrototypeMain {
	public static void main(String[] args) throws CloneNotSupportedException{
		CloneObject cloneObject1 = new CloneObject(1,2);
		CloneObject cloneObject2 = (CloneObject)cloneObject1.clone();
		System.err.println(cloneObject1 == cloneObject2);
		System.err.println(cloneObject1.getProperties1() == cloneObject2.getProperties1());
		//证明浅复制
		System.err.println("-----------------证明浅复制--------------------");
		System.err.println(cloneObject1.getProperties1());
		cloneObject2.getProperties1().setInteger(3);
		System.err.println(cloneObject1.getProperties1());
		//其他复制方法
		System.err.println("-----------------其他复制方法(浅复制)--------------------");
		try {
			CloneObject cloneBean3 = (CloneObject)BeanUtils.cloneBean(cloneObject1);
			System.err.println(cloneObject1 == cloneBean3);
			System.err.println(cloneObject1.getProperties1() == cloneBean3.getProperties1());
		} catch (IllegalAccessException | InstantiationException | InvocationTargetException
				| NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("-----------------其他复制方法(深复制)--------------------");
		//该方法要求 被复制的类 和准备要复制的类 都必须实现 java.io.Serializable
		CloneObject cloneObject4 = SerializationUtils.clone(cloneObject1);
		System.err.println(cloneObject1 == cloneObject4);
		System.err.println(cloneObject1.getProperties1() == cloneObject4.getProperties1());
	}
}
