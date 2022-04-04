package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Motor.ElectricalMotor;
import Patterns.AbstractFactory.Motor.Motor;
import Patterns.AbstractFactory.Transport.Car;
import Patterns.AbstractFactory.Transport.Motorbike;

import java.awt.*;

/**
 * Electrical transport factory.
 * Construct and return Electrical transports.
 */
public class ElectricalTransportFactory implements AbstractTransportFactory {
	private final double ELECTRICAL_CAR_MOTOR_WEIGHT = 300;
	private final double ELECTRICAL_MOTORBIKE_MOTOR_WEIGHT = 100;

	private Voltage voltage;

	/**
	 * ElectricalTransportFactory constructor.
	 * @param voltage Motor voltage.
	 */
	public ElectricalTransportFactory(Voltage voltage) {
		this.setVoltage(voltage);
	}

	/**
	 * Create an electrical car.
	 * @param brand Car brand.
	 * @param color Car color.
	 * @param placesCount Car places count.
	 * @param doorCount Car door count.
	 * @return Electrical Car.
	 */
	@Override
	public Car createCar(String brand, Color color, int placesCount, int doorCount) {
		return new Car(brand, color, placesCount, doorCount, new ElectricalMotor(Voltage.FOUR_HUNDRED_FIFTEEN, ELECTRICAL_CAR_MOTOR_WEIGHT));
	}

	/**
	 * Create a electrical motorbike.
	 * @param brand Motorbike brand.
	 * @param color Motorbike color.
	 * @param cylinder Motorbike cylinder.
	 * @return Electrical Motorbike.
	 */
	@Override
	public Motorbike createMotorbike(String brand, Color color, String cylinder) {
		return new Motorbike(brand, color, cylinder, new ElectricalMotor(Voltage.TWO_HUNDRED_TWENTY, ELECTRICAL_MOTORBIKE_MOTOR_WEIGHT));
	}

	/**
	 * Voltage getter.
	 * @return Transport motor voltage.
	 */
	public Voltage getVoltage() {
		return voltage;
	}

	/**
	 * Voltage setter.
	 * @param voltage Transport motor voltage.
	 */
	public void setVoltage(Voltage voltage) {
		this.voltage = voltage;
	}
}