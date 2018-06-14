package chain;

import chain.bean.StatusBean;
import chain.constants.BaseStatus;
import chain.nopure.NoPureStatus;
import chain.nopure.impl.InApprovalNoPureStatus;
import chain.nopure.impl.NewNoPureStatus;
import chain.nopure.impl.PassedNoPureStatus;
import chain.pure.PureStatus;
import chain.pure.impl.InApprovalPureStatus;
import chain.pure.impl.NewPureStatus;
import chain.pure.impl.PassedPureStatus;

public class ChainMain {
	public static void main(String[] args) {
		System.out.println("------------------------����������---------------------------");
		
		PureStatus pureChain = new NewPureStatus(new InApprovalPureStatus(new PassedPureStatus(null)));//��������
		StatusBean pureStatus = new StatusBean(BaseStatus.NEW);
		pureChain.request(pureStatus);
		System.out.println(pureStatus);
		
		System.out.println("------------------------������������--------------------------");
		
		NoPureStatus noPureChain = new NewNoPureStatus(new InApprovalNoPureStatus(new PassedNoPureStatus(null)));// ������������
		StatusBean noPureStatus = new StatusBean(BaseStatus.NEW);
		noPureChain.request(noPureStatus);
		System.out.println(noPureStatus);
	}
}
