package adapter;

import adapter.voltage.Voltage;
import adapter.voltage.impl.Voltage110;
import adapter.voltage.impl.Voltage220;

public class Adapter {
	public Voltage110 getVoltage110(Voltage voltage) {
		if(voltage instanceof Voltage110) {
			return (Voltage110)voltage;
		}
		return new Voltage110();
	}

	public Voltage220 getVoltage220(Voltage voltage) {
		if(voltage instanceof Voltage220) {
			return (Voltage220)voltage;
		}
		return new Voltage220();
	}
}
