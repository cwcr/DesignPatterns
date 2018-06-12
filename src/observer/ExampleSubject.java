package observer;

public class ExampleSubject extends Subject{
	public String status;
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
		notice();
	}
}
