package Patterns.AbstractFactory.Transport;

import Patterns.AbstractFactory.Motor.Motor;

import java.awt.*;

/**
 * Represent a motorbike.
 */
public class Motorbike extends Transport {
	private String cylinder;

	/**
	 * Motorbike constructor.
	 * @param brand Motorbike brand.
	 * @param color Motorbike color.
	 * @param cylinder Motorbike cylinder.
	 * @param motor Motorbike motor.
	 */
	public Motorbike(String brand, Color color, String cylinder, Motor motor) {
		this.setBrand(brand);
		this.setColor(color);
		this.setCylinder(cylinder);
		this.setMotor(motor);
	}

	/**
	 * Cylinder getter.
	 * @return Motorbike cylinder.
	 */
	String getCylinder() {
		return this.cylinder;
	}

	/**
	 * Motorbike setter.
	 * @param cylinder Motorbike cylinder.
	 */
	void setCylinder(String cylinder) {
		this.cylinder = cylinder;
	}

	/**
	 * To string method of the Motorbike class.
	 * @return Definition String of a motorbike.
	 */
	public String toString() {
		return super.toString() + "Motorbike: " + this.getCylinder() + " Motor: " + this.getMotor().toString();
	}

}