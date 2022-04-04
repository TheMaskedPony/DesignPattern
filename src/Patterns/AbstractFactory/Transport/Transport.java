package Patterns.AbstractFactory.Transport;

import Patterns.AbstractFactory.Motor.Motor;

import java.awt.*;

/**
 * Abstract representation of transport.
 */
public abstract class Transport {
	private String brand;
	private Color color;
	private Motor motor;

	/**
	 * Transport brand getter.
	 * @return Transport brand
	 */
	String getBrand() {
		return this.brand;
	}

	/**
	 * Transport brand setter.
	 * @param brand Transport brand.
	 */
	void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * Transport color getter,
	 * @return Transport color.
	 */
	String getColor() {
		return this.color.toString();
	}

	/**
	 * Transport color setter.
	 * @param color Transport color.
	 */
	void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Transport motor getter.
	 * @return Transport motor.
	 */
	Motor getMotor() {
		return this.motor;
	}

	/**
	 * Transport motor setter.
	 * @param motor Transport motor.
	 */
	void setMotor(Motor motor) {
		this.motor = motor;
	}

	/**
	 * To string method of the Transport class.
	 * @return Definition String of transport.
	 */
	public String toString() {
		return this.getBrand() + ", " + this.getColor() + " ";
	}

}