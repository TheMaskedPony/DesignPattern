package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Motor.Motor;
import Patterns.AbstractFactory.Transport.Car;
import Patterns.AbstractFactory.Transport.Motorbike;

import java.awt.*;

public interface AbstractTransportFactory {

	Car createCar(String brand, Color color, int placesCount, int doorCount, Motor motor);

	Motorbike createMotorbike(String brand, Color color, String cylinder, Motor motor);

}