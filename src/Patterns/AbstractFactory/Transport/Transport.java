package Patterns.AbstractFactory.Transport;

import Patterns.AbstractFactory.Motor.Motor;

import java.awt.*;

public abstract class Transport {

	private String brand;
	private Color color;
	private Motor motor;

	String getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	void setBrand(String brand) {
		this.brand = brand;
	}

	String getColor() {
		return this.color.toString();
	}

	/**
	 * 
	 * @param color
	 */
	void setColor(Color color) {
		this.color = color;
	}

	Motor getMotor() {
		return this.motor;
	}

	/**
	 * 
	 * @param motor
	 */
	void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String toString() {
		return this.getBrand() + ", " + this.getColor();
	}

}