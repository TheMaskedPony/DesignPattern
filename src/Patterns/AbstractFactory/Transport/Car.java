package Patterns.AbstractFactory.Transport;

import Patterns.AbstractFactory.Motor.Motor;

import java.awt.*;

public class Car extends Transport {

	private int placesCount;
	private int doorCount;

	/**
	 *  @param brand
	 * @param color
	 * @param placesCount
	 * @param doorCount
	 */
	public Car(String brand, Color color, int placesCount, int doorCount, Motor motor) {
		this.setBrand(brand);
		this.setColor(color);
		this.setPlacesCount(placesCount);
		this.setDoorCount(doorCount);
		this.setMotor(motor);
	}

	int getPlacesCount() {
		return this.placesCount;
	}

	/**
	 * 
	 * @param places
	 */
	void setPlacesCount(int places) {
		this.placesCount = places;
	}

	int getDoorCount() {
		return this.doorCount;
	}

	/**
	 * 
	 * @param doors
	 */
	void setDoorCount(int doors) {
		this.doorCount = doors;
	}

	public String toString() {
		return super.toString() + "Car: " + this.getDoorCount() + ", " + this.getPlacesCount() + ", Motor: " + this.getMotor().toString();
	}

}