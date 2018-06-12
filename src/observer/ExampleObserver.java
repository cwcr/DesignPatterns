package observer;

public class ExampleObserver extends Observer{
	private String name;
	
	public ExampleObserver(Subject subject,String name) {
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	void update() {
		// TODO Auto-generated method stub
		System.err.println(name+" ’µΩ");
	}
	

}
