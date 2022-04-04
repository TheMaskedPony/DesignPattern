package Patterns.AbstractFactory.Motor;
import Patterns.AbstractFactory.GasType;

/**
 * Represent a gas motor.
 */
public class GasMotor extends Motor {
	private GasType type;

	/**
	 * Gas motor constructor.
	 * @param type Type of gas that the motor use.
	 * @param weight Motor weight.
	 */
	public GasMotor(GasType type, double weight) {
		this.setWeight(weight);
		this.setType(type);
	}

	/**
	 * Type of gas getter.
	 * @return Type of gas.
	 */
	public GasType getType() {
		return this.type;
	}

	/**
	 * Type setter.
	 * @param type type of gas that the motor use.
	 */
	public void setType(GasType type) {
		this.type = type;
	}

	/**
	 * To string method of the GasMotor class.
	 * @return Definition String of a gas motor.
	 */
	@Override
	public String toString() {
		return super.toString() + ", Gas, type of gas: " + this.getType().toString();
	}
}