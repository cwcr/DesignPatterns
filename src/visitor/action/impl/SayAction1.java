package visitor.action.impl;

import visitor.action.Action;
import visitor.bean.Person;

public class SayAction1 extends Action{

	@Override
	public void manSay(Person p) {
		System.out.println("�к�˵������"+p.getFamilyName()+"���ҽ���"+p.getAge()+"��");
	}

	@Override
	public void womanSay(Person p) {
		System.out.println("Ů��˵������"+p.getFamilyName()+"���ҽ���"+p.getAge()+"��");
	}

}
