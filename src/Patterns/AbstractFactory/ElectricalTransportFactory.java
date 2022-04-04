package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Motor.Electrical;
import Patterns.AbstractFactory.Motor.Gas;
import Patterns.AbstractFactory.Motor.Motor;
import Patterns.AbstractFactory.Transport.Car;
import Patterns.AbstractFactory.Transport.Motorbike;

import java.awt.*;

class ElectricalTransportFactory implements AbstractTransportFactory {

	@Override
	public Car createCar(String brand, Color color, int placesCount, int doorCount, Motor motor) {
		return new Car(brand, color, placesCount, doorCount, new Electrical(Voltage.FOUR_HUNDRED_FIFTEEN, 1000.0));
	}

	@Override
	public Motorbike createMotorbike(String brand, Color color, String cylinder, Motor motor) {
		return new Motorbike(brand, color, cylinder, new Electrical(Voltage.TWO_HUNDRED_TWENTY, 150));
	}
}