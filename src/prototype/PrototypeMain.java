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
		//֤��ǳ����
		System.err.println("-----------------֤��ǳ����--------------------");
		System.err.println(cloneObject1.getProperties1());
		cloneObject2.getProperties1().setInteger(3);
		System.err.println(cloneObject1.getProperties1());
		//�������Ʒ���
		System.err.println("-----------------�������Ʒ���(ǳ����)--------------------");
		try {
			CloneObject cloneBean3 = (CloneObject)BeanUtils.cloneBean(cloneObject1);
			System.err.println(cloneObject1 == cloneBean3);
			System.err.println(cloneObject1.getProperties1() == cloneBean3.getProperties1());
		} catch (IllegalAccessException | InstantiationException | InvocationTargetException
				| NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("-----------------�������Ʒ���(���)--------------------");
		//�÷���Ҫ�� �����Ƶ��� ��׼��Ҫ���Ƶ��� ������ʵ�� java.io.Serializable
		CloneObject cloneObject4 = SerializationUtils.clone(cloneObject1);
		System.err.println(cloneObject1 == cloneObject4);
		System.err.println(cloneObject1.getProperties1() == cloneObject4.getProperties1());
	}
}
