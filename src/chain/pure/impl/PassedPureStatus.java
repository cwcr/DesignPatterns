package chain.pure.impl;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.pure.PureStatus;

public class PassedPureStatus extends PureStatus{
	public PassedPureStatus(PureStatus pureStatus) {
		super(pureStatus,BaseStatus.PASSED);
	}

	@Override
	public void deal(StatusBean statusBean) {
		statusBean.add();
		System.out.println("״̬Ϊ"+BaseStatus.PASSED);
	}
}
