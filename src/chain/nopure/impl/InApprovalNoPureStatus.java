package chain.nopure.impl;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.nopure.NoPureStatus;

public class InApprovalNoPureStatus extends NoPureStatus{
	public InApprovalNoPureStatus(NoPureStatus noPureStatus) {
		super(noPureStatus,BaseStatus.IN_APPROVAL);
	}

	@Override
	public void deal(StatusBean statusBean) {
		statusBean.add();
		statusBean.setStatus(BaseStatus.PASSED);
	}

}
