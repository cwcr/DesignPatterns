package chain.pure.impl;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.pure.PureStatus;

public class NewPureStatus extends PureStatus{
	
	public NewPureStatus(PureStatus pureStatus) {
		super(pureStatus,BaseStatus.NEW);
	}

	@Override
	public void deal(StatusBean statusBean) {
		statusBean.add();
		statusBean.setStatus(BaseStatus.IN_APPROVAL);
	}
}
