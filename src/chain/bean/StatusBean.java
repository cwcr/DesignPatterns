package chain.bean;

public class StatusBean {
	private String status;
	private int count = 0;
	
	public StatusBean(String status) {
		count = 0;
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public StatusBean setStatus(String status) {
		this.status = status;
		return this;
	}
	
	public void add() {
		count ++ ;
	}
	
	@Override
	public String toString() {
		return "�����󱻴����"+count+"��!"+"��ǰ״̬Ϊ"+status;
	}
	
}
