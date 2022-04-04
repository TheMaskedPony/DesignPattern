package Patterns.AbstractFactory.Transport;

import Patterns.AbstractFactory.Motor.Electrical;

import java.awt.*;

public class Motorbike extends Transport {

	private String cylinder;

	/**
	 *
	 * @param brand
	 * @param color
	 * @param cylinder
	 * @param electrical
	 */
	public Motorbike(String brand, Color color, String cylinder, Electrical electrical) {
		this.setBrand(brand);
		this.setColor(color);
		this.setCylinder(cylinder);
		this.setMotor(electrical);
	}

	String getCylinder() {
		return this.cylinder;
	}

	/**
	 * 
	 * @param cylinder
	 */
	void setCylinder(String cylinder) {
		this.cylinder = cylinder;
	}

	public String toString() {
		return super.toString() + "Motorbike: " + this.getCylinder() + " Motor: " + this.getMotor().toString();
	}

}