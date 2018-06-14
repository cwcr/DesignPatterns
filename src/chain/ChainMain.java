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
		System.out.println("------------------------纯的责任链---------------------------");
		
		PureStatus pureChain = new NewPureStatus(new InApprovalPureStatus(new PassedPureStatus(null)));//纯责任链
		StatusBean pureStatus = new StatusBean(BaseStatus.NEW);
		pureChain.request(pureStatus);
		System.out.println(pureStatus);
		
		System.out.println("------------------------不纯的责任链--------------------------");
		
		NoPureStatus noPureChain = new NewNoPureStatus(new InApprovalNoPureStatus(new PassedNoPureStatus(null)));// 不纯的责任链
		StatusBean noPureStatus = new StatusBean(BaseStatus.NEW);
		noPureChain.request(noPureStatus);
		System.out.println(noPureStatus);
	}
}
