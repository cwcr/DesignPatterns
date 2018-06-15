package visitor.action.impl;

import visitor.action.Action;
import visitor.bean.Person;

public class SayAction2 extends Action{
	@Override
	public void manSay(Person p) {
		System.out.println("我是一个"+p.getAge()+"岁的男孩，我姓"+p.getFamilyName());
	}

	@Override
	public void womanSay(Person p) {
		System.out.println("我是一个"+p.getAge()+"岁的女孩，我姓"+p.getFamilyName());
	}

}
