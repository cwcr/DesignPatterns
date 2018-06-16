package adapter.charger.impl;

import adapter.Adapter;
import adapter.charger.Charger;
import adapter.voltage.Voltage;
import adapter.voltage.impl.Voltage220;

public class ChineseCharger extends Charger{
	private Adapter adapter = new Adapter();
	@Override
	public void changer(Voltage voltage) {
		if(!(voltage instanceof Voltage220)) {
			voltage = adapter.getVoltage220(voltage);
		}
		voltage.getVoltage();
	}
}
