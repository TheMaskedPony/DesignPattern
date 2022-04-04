package Patterns.AbstractFactory.Motor;

public abstract class Motor {

	private double weight;

	double getWeight() {
		return this.weight;
	}

	/**
	 * 
	 * @param weight
	 */
	void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return this.getWeight() + " kg";
	}
}