package visitor.action.impl;

import visitor.action.Action;
import visitor.bean.Person;

public class SayAction1 extends Action{

	@Override
	public void manSay(Person p) {
		System.out.println("男孩说：我姓"+p.getFamilyName()+"，我今年"+p.getAge()+"岁");
	}

	@Override
	public void womanSay(Person p) {
		System.out.println("女孩说：我姓"+p.getFamilyName()+"，我今年"+p.getAge()+"岁");
	}

}
