package Patterns.AbstractFactory.Motor;
import Patterns.AbstractFactory.GasType;

public class Gas extends Motor {

	private GasType type;

	public Gas(GasType type, double weight) {
		this.setWeight(weight);
		this.setType(type);
	}

	public GasType getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(GasType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + ", Gas, type of gas: " + this.getType().toString();
	}
}