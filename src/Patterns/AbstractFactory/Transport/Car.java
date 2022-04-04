package Patterns.AbstractFactory.Transport;

import Patterns.AbstractFactory.Motor.Motor;

import java.awt.*;

/**
 * Represent a car.
 */
public class Car extends Transport {
	private int placesCount;
	private int doorCount;

	/**
	 * Car constructor.
	 * @param brand Car brand.
	 * @param color Car color.
	 * @param placesCount Car placesCount.
	 * @param doorCount Car doorCount.
	 */
	public Car(String brand, Color color, int placesCount, int doorCount, Motor motor) {
		this.setBrand(brand);
		this.setColor(color);
		this.setPlacesCount(placesCount);
		this.setDoorCount(doorCount);
		this.setMotor(motor);
	}

	/**
	 * Place count getter.
	 * @return Car place count.
	 */
	int getPlacesCount() {
		return this.placesCount;
	}

	/**
	 * Place count setter.
	 * @param places Number of places in the car.
	 */
	void setPlacesCount(int places) {
		this.placesCount = places;
	}

	/**
	 * Door count getter.
	 * @return Door count.
	 */
	int getDoorCount() {
		return this.doorCount;
	}

	/**
	 * Door count setter.
	 * @param doors Number of doors of the car.
	 */
	void setDoorCount(int doors) {
		this.doorCount = doors;
	}

	/**
	 * To string method of the Car class.
	 * @return Definition String of a car.
	 */
	public String toString() {
		return super.toString() + "Car: " + this.getDoorCount() + ", " + this.getPlacesCount() + ", Motor: " + this.getMotor().toString();
	}

}