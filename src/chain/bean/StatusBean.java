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
		return "本对象被处理过"+count+"次!"+"当前状态为"+status;
	}
	
}
