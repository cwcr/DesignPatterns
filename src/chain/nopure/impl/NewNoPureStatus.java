package chain.nopure.impl;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.nopure.NoPureStatus;

public class NewNoPureStatus extends NoPureStatus{
	public NewNoPureStatus(NoPureStatus noPureStatus) {
		super(noPureStatus,BaseStatus.NEW);
	}

	@Override
	public void deal(StatusBean statusBean) {
		statusBean.add();
		statusBean.setStatus(BaseStatus.IN_APPROVAL);
	}
}
