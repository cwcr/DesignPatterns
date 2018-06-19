package decorater1.dto.impl;

import decorater1.Person;
import decorater1.dto.Role;

public class Athletes extends Role{
	public Athletes(Person person) {
		super(person);
	}
	
	@Override
	public void call() {
		super.call();
		System.out.println("我是运动员");
	}
}
