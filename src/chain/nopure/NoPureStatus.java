package chain.nopure;

import chain.bean.StatusBean;

public abstract class NoPureStatus {
	private NoPureStatus noPureStatus;
	private String status;
	
	public NoPureStatus(NoPureStatus noPureStatus,String status) {
		this.noPureStatus = noPureStatus;
		this.status = status;
	}
	
	protected abstract void deal(StatusBean statusBean);
	
	public void request(StatusBean statusBean) {
		if(status.equals(statusBean.getStatus())) {
			System.out.println("处理一次");
			deal(statusBean);
		}
		if(noPureStatus!=null) {
			noPureStatus.request(statusBean);
		}
	}
}
