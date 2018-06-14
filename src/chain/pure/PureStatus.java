package chain.pure;

import chain.bean.StatusBean;

public abstract class PureStatus {
	private PureStatus PureStatus;
	
	private String status;
	
	public PureStatus(PureStatus PureStatus,String status) {
		this.PureStatus = PureStatus;
		this.status = status;
	}
	
	protected abstract void deal(StatusBean statusBean);
	
	public void request(StatusBean statusBean) {
		if(status.equals(statusBean.getStatus())) {
			deal(statusBean);
			System.out.println("处理一次");
		}else {
			if(PureStatus!=null) {
				PureStatus.request(statusBean);
			}
		}
	}
}
