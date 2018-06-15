package visitor.bean;

import visitor.action.Action;

public class Woman extends Person{

	public Woman(int age, String familyName) {
		super(age, familyName);
	}

	@Override
	public void say(Action action) {
		action.womanSay(this);
	}
}
