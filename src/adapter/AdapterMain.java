package adapter;

import adapter.charger.impl.AmericanCharger;
import adapter.charger.impl.ChineseCharger;
import adapter.voltage.impl.Voltage110;
import adapter.voltage.impl.Voltage220;

public class AdapterMain {
	public static void main(String[] args) {
		Voltage110 voltage110 = new Voltage110();
		Voltage220 voltage220 = new Voltage220();
		Adapter adapter = new Adapter();
		
		System.out.println("-----ԭʼ��Ϊ----");
		voltage110.getVoltage();
		voltage220.getVoltage();
		
		System.out.println("---------�����1------------");
		AmericanCharger americanCharger = new AmericanCharger();
		americanCharger.changer(voltage110);
		americanCharger.changer(voltage220);
		System.out.println("---------�ⲿ����------------");
		americanCharger.changer(adapter.getVoltage110(voltage220));
		
		System.out.println("---------�����2------------");
		ChineseCharger chineseCharger = new ChineseCharger();
		chineseCharger.changer(voltage220);
		System.out.println("---------�ڲ�����------------");
		chineseCharger.changer(voltage110);
		System.out.println("---------�ⲿ����------------");
		chineseCharger.changer(adapter.getVoltage220(voltage110));
	}
}
