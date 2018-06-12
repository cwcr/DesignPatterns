package memo;

public class MemoMain {
	public static void main(String[] args) {
		Text text = new Text(Operator.newInstance());
		text.setContent("内容1");
		text.setContent("内容2");
		text.setContent("内容3");
		text.setContent("内容4");
		text.setContent("内容5");
		text.setContent("内容6");
		System.err.println(text);
		text.undo();
		System.err.println(text);
		text.undo();
		System.err.println(text);
		text.undo();
		System.err.println(text);
		text.undo();
		System.err.println(text);
		text.undo();
		System.err.println(text);
		text.undo();
		System.err.println(text);
		
	}
}
