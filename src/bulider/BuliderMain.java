package bulider;

import java.util.ArrayList;

import bulider.impl.BuilderMethodA;
import bulider.impl.BuilderMethodB;

public class BuliderMain {
	public static void main(String[] args) {
		System.err.println("构造器");
		System.err.println(new Buliding("bottom", "top"));
		
		Director director = new Director();
		
		System.err.println("构建方法1");
		Bulider builderMethodA = new BuilderMethodA();
		System.err.println(director.construct1(builderMethodA));
		
		System.err.println("构建方法2");
		Bulider builderMethodB = new BuilderMethodB();
		System.err.println(director.construct1(builderMethodB));
		
		System.err.println("新构建方法1");
		Bulider builderMethodA1 = new BuilderMethodA();
		System.err.println(director.construct2(builderMethodA1));
		
		System.err.println("setter(Bulider)");
		ArrayList<String> list = new ArrayList<>();
		list.add("bottom");
		list.add("top");
		System.err.println(new Buliding().setList(list));
	}
}
