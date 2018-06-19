package composite;

import composite.dto.Role;
import composite.dto.impl.Athletes;
import composite.dto.impl.Teacher;

public class CompositeMain {
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println("---------------成为老师---------------");
		Teacher teacher = new Teacher();
		person.is(teacher);
		person.call();
		
		System.out.println("---------------成为运动员---------------");
		Athletes athletes = new Athletes();
		person.is(athletes);
		person.call();
	}
}
