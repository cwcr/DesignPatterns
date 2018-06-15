package visitor;

import visitor.action.Action;
import visitor.action.impl.SayAction1;
import visitor.action.impl.SayAction2;
import visitor.bean.Man;
import visitor.bean.Woman;

public class VisitorMain {
	public static void main(String[] args) {
		Man man = new Man(18, "王");
		Woman woman = new Woman(19, "赵");
		
		Action action1 = new SayAction1();
		man.say(action1);
		woman.say(action1);
	
		System.out.println("------------------添加新行为---------------------");
		Action action2 = new SayAction2();
		man.say(action2);
		woman.say(action2);
	}
}
