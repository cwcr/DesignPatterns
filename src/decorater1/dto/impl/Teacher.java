package decorater1.dto.impl;

import decorater1.Person;
import decorater1.dto.Role;

public class Teacher extends Role{
	public Teacher(Person person) {
		super(person);
	}
	@Override
	public void call() {
		super.call();
		System.out.println("我是老师");
	}
}
