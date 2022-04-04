package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Motor.Gas;
import Patterns.AbstractFactory.Motor.Motor;
import Patterns.AbstractFactory.Transport.Car;
import Patterns.AbstractFactory.Transport.Motorbike;

import java.awt.*;

public class GasTransportFactory implements AbstractTransportFactory {
	private GasType type;

	GasTransportFactory(GasType type) {
		this.setType(type);
	}

	@Override
	public Car createCar(String brand, Color color, int placesCount, int doorCount, Motor motor) {
		return new Car(brand, color, placesCount, doorCount, new Gas(this.getType(), 1000));
	}

	@Override
	public Motorbike createMotorbike(String brand, Color color, String cylinder, Motor motor) {
		return null;
	}

	public GasType getType() {
		return type;
	}

	public void setType(GasType type) {
		this.type = type;
	}
}