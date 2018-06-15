package visitor.bean;

import visitor.action.Action;

public abstract class Person {
	protected int age;
	protected String familyName;
	public Person(int age,String familyName) {
		this.age = age;
		this.familyName = familyName;
	}
	
	public abstract void say(Action action);
	
	public String getFamilyName() {
		return familyName;
	}
	
	public int getAge() {
		return age;
	}
}
