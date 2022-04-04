package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Motor.Motor;
import Patterns.AbstractFactory.Transport.Car;
import Patterns.AbstractFactory.Transport.Motorbike;

import java.awt.*;

/**
 * Abstract transport factory interface.
 * Define the contract of a transport factory.
 */
public interface AbstractTransportFactory {

	/**
	 * Create a car.
	 * @param brand Car brand.
	 * @param color Car color.
	 * @param placesCount Car places count.
	 * @param doorCount Car door count.
	 * @return A car object.
	 */
	Car createCar(String brand, Color color, int placesCount, int doorCount);

	/**
	 * Create a motorbike.
	 * @param brand Motorbike brand.
	 * @param color Motorbike color.
	 * @param cylinder Motorbike cylinder.
	 * @return A motorbike object.
	 */
	Motorbike createMotorbike(String brand, Color color, String cylinder);

}