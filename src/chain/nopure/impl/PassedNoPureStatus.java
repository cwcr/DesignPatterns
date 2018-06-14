package chain.nopure.impl;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.nopure.NoPureStatus;

public class PassedNoPureStatus extends NoPureStatus{
	public PassedNoPureStatus(NoPureStatus noPureStatus) {
		super(noPureStatus,BaseStatus.PASSED);
	}

	@Override
	public void deal(StatusBean statusBean) {
		statusBean.add();
		System.out.println("״̬Ϊ"+BaseStatus.PASSED);
	}
}
