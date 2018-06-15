package visitor.action.impl;

import visitor.action.Action;
import visitor.bean.Person;

public class SayAction2 extends Action{
	@Override
	public void manSay(Person p) {
		System.out.println("����һ��"+p.getAge()+"����к�������"+p.getFamilyName());
	}

	@Override
	public void womanSay(Person p) {
		System.out.println("����һ��"+p.getAge()+"���Ů��������"+p.getFamilyName());
	}

}
