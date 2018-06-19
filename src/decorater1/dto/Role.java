package decorater1.dto;

import decorater1.Person;

public abstract class Role extends Person{
	protected Person person;
	protected Role(Person person) {
		this.person = person;
	}
	public void call() {
		person.call();
	}
}
