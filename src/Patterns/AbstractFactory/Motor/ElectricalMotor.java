package Patterns.AbstractFactory.Motor;

import Patterns.AbstractFactory.Voltage;

/**
 * Represent an electrical motor.
 */
public class ElectricalMotor extends Motor {
	private Voltage voltage;

	/**
	 * Electrical motor constructor
	 * @param voltage Motor voltage.
	 * @param weight Motor weight.
	 */
	public ElectricalMotor(Voltage voltage, double weight) {
		this.setVoltage(voltage);
		this.setWeight(weight);
	}

	/**
	 * Voltage getter.
	 * @return Motor voltage.
	 */
	public Voltage getVoltage() {
		return this.voltage;
	}

	/**
	 * Voltage setter.
	 * @param voltage Motor voltage.
	 */
	public void setVoltage(Voltage voltage) {
		this.voltage = voltage;
	}

	/**
	 * To string method of the ElectricalMotor class.
	 * @return Definition String of an electrical motor.
	 */
	@Override
	public String toString() {
		return super.toString() + ", electrical, voltage:" + voltage;
	}
}