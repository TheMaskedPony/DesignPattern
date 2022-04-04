package Patterns.AbstractFactory.Motor;

/**
 * Abstract representation of a motor.
 */
public abstract class Motor {
	private double weight;

	/**
	 * Weight getter.
	 * @return Motor weight.
	 */
	double getWeight() {
		return this.weight;
	}

	/**
	 * Weight setter.
	 * @param weight Motor weight.
	 */
	void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * To string method of the Motor class.
	 * @return Definition String of a motor.
	 */
	@Override
	public String toString() {
		return this.getWeight() + " kg";
	}
}