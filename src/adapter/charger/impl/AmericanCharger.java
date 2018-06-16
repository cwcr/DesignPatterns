package adapter.charger.impl;

import adapter.charger.Charger;
import adapter.voltage.Voltage;
import adapter.voltage.impl.Voltage110;

public class AmericanCharger extends Charger{
	@Override
	public void changer(Voltage voltage) {
		if(voltage instanceof Voltage110) {
			voltage.getVoltage();
		}else {
			System.out.println("电压不符合要求-断电保护");
		}
	}
}
