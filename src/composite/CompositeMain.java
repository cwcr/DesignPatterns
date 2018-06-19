package composite;

import composite.dto.Role;
import composite.dto.impl.Athletes;
import composite.dto.impl.Teacher;

public class CompositeMain {
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println("---------------��Ϊ��ʦ---------------");
		Teacher teacher = new Teacher();
		person.is(teacher);
		person.call();
		
		System.out.println("---------------��Ϊ�˶�Ա---------------");
		Athletes athletes = new Athletes();
		person.is(athletes);
		person.call();
	}
}
