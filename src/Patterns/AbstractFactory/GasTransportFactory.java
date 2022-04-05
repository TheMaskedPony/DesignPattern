package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Motor.GasMotor;
import Patterns.AbstractFactory.Motor.Motor;
import Patterns.AbstractFactory.Transport.Car;
import Patterns.AbstractFactory.Transport.Motorbike;
import Patterns.AbstractFactory.Transport.Transport;

import java.awt.*;

/**
 * Electrical transport factory.
 * Construct and return Electrical transports.
 */
public class GasTransportFactory implements AbstractTransportFactory {
	private final double GAS_CAR_MOTOR_WEIGHT = 250.0;
	private final double GAS_MOTORBIKE_MOTOR_WEIGHT = 85.0;

	private GasType type;

	/**
	 * GasTransportFactory constructor.
	 * @param type Gas type.
	 */
	public GasTransportFactory(GasType type) {
		this.setType(type);
	}

	/**
	 * Create a gas car.
	 * @param brand Car brand.
	 * @param color Car color.
	 * @param placesCount Car places count.
	 * @param doorCount Car door count.
	 * @return Gas Car.
	 */
	@Override
	public Transport createCar(String brand, Color color, int placesCount, int doorCount) {
		return new Car(brand, color, placesCount, doorCount, new GasMotor(this.getType(), GAS_CAR_MOTOR_WEIGHT));
	}

	/**
	 * Create a gas motorbike.
	 * @param brand Motorbike brand.
	 * @param color Motorbike color.
	 * @param cylinder Motorbike cylinder.
	 * @return Gas Motorbike.
	 **/
	@Override
	public Transport createMotorbike(String brand, Color color, String cylinder) {
		return new Motorbike(brand, color, cylinder, new GasMotor(this.getType(), GAS_MOTORBIKE_MOTOR_WEIGHT));
	}

	/**
	 * Gas type getter.
	 * @return Gas type.
	 */
	public GasType getType() {
		return type;
	}

	/**
	 * Gas type setter.
	 * @param type Gas type.
	 */
	public void setType(GasType type) {
		this.type = type;
	}
}