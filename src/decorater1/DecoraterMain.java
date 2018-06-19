package decorater1;

import decorater1.dto.impl.Athletes;
import decorater1.dto.impl.Teacher;

public class DecoraterMain {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("-----------��Ϊ��ʦ-----------");
		person = new Teacher(person);
		person.call();
		System.out.println("-----------��Ϊ�˶�Ա-----------");
		person = new Athletes(person);
		person.call();
		
		/*Person person = new Person();
		System.out.println("-----------��Ϊ�˶�Ա-----------");
		person = new Athletes(person);
		person.call();
		System.out.println("-----------��Ϊ��ʦ-----------");
		person = new Teacher(person);
		person.call();*/
	}
}
