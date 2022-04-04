package Patterns.AbstractFactory.Motor;

import Patterns.AbstractFactory.Voltage;

public class Electrical extends Motor {

	private Voltage voltage;

	public Electrical(Voltage voltage, double weight) {
		this.setVoltage(voltage);
		this.setWeight(weight);
	}

	public Voltage getVoltage() {
		return this.voltage;
	}

	/**
	 * 
	 * @param voltage
	 */
	public void setVoltage(Voltage voltage) {
		this.setVoltage(voltage);
	}

	@Override
	public String toString() {
		return super.toString() + ", electrical, voltage:" + voltage;
	}
}