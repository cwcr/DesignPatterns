package memo;

public class MemoMain {
	public static void main(String[] args) {
		Text text = new Text(Operator.newInstance());
		text.setContent("����1");
		text.setContent("����2");
		text.setContent("����3");
		text.setContent("����4");
		text.setContent("����5");
		text.setContent("����6");
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
