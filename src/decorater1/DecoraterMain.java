package decorater1;

import decorater1.dto.impl.Athletes;
import decorater1.dto.impl.Teacher;

public class DecoraterMain {
	public static void main(String[] args) {
		Person person = new Person();
		System.out.println("-----------成为老师-----------");
		person = new Teacher(person);
		person.call();
		System.out.println("-----------成为运动员-----------");
		person = new Athletes(person);
		person.call();
		
		/*Person person = new Person();
		System.out.println("-----------成为运动员-----------");
		person = new Athletes(person);
		person.call();
		System.out.println("-----------成为老师-----------");
		person = new Teacher(person);
		person.call();*/
	}
}
