package chain.pure.impl;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.pure.PureStatus;

public class InApprovalPureStatus extends PureStatus{
	public InApprovalPureStatus(PureStatus pureStatus) {
		super(pureStatus,BaseStatus.IN_APPROVAL);
	}

	@Override
	public void deal(StatusBean statusBean) {
		statusBean.add();
		statusBean.setStatus(BaseStatus.PASSED);
	}
}
