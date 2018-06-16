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
		
		System.out.println("-----原始行为----");
		voltage110.getVoltage();
		voltage220.getVoltage();
		
		System.out.println("---------充电器1------------");
		AmericanCharger americanCharger = new AmericanCharger();
		americanCharger.changer(voltage110);
		americanCharger.changer(voltage220);
		System.out.println("---------外部适配------------");
		americanCharger.changer(adapter.getVoltage110(voltage220));
		
		System.out.println("---------充电器2------------");
		ChineseCharger chineseCharger = new ChineseCharger();
		chineseCharger.changer(voltage220);
		System.out.println("---------内部适配------------");
		chineseCharger.changer(voltage110);
		System.out.println("---------外部适配------------");
		chineseCharger.changer(adapter.getVoltage220(voltage110));
	}
}
