package template;

public abstract class Question {
	abstract void question();
	
	public void answer() {
		question();
		System.err.println("´ð£ºÂÔ");
	}
}
