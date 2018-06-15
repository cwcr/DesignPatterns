package visitor.bean;

import visitor.action.Action;

public class Man extends Person{
	public Man(int age, String familyName) {
		super(age, familyName);
	}

	@Override
	public void say(Action action) {
		action.manSay(this);
	}
}
