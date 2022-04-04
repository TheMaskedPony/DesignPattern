import Patterns.AbstractFactory.GasTransportFactory;
import Patterns.AbstractFactory.ElectricalTransportFactory;
import Patterns.AbstractFactory.GasType;
import Patterns.AbstractFactory.Motor.ElectricalMotor;
import Patterns.AbstractFactory.Voltage;
import Patterns.Singleton.BankAccount;
import Patterns.Singleton.Transaction;
import Patterns.Singleton.TransactionsLogger;

import java.awt.*;

public class App {
    public static void main(String[] args) {
        /*
        BankAccount account1 = new BankAccount("John Doe", 999999999);
        BankAccount account2 = new BankAccount("Jannette Richmond", 100000);

        TransactionsLogger logger = TransactionsLogger.getInstance();

        new Transaction(10000, account1, account2);
        new Transaction(199999, account1, account2);
        new Transaction(5000, account2, account1);
        new Transaction(5000000, account2, account1);

        System.out.println(logger.getLogs());*/

        GasTransportFactory gasFactory = new GasTransportFactory(GasType.PREMIUM);
        System.out.println(gasFactory.createCar("Volkswagen", Color.BLACK, 5, 5));
        System.out.println(gasFactory.createCar("Toyota", Color.WHITE, 5, 3));
        System.out.println(gasFactory.createCar("Bentley", Color.PINK, 5, 5));
        System.out.println(gasFactory.createMotorbike("Honda", Color.RED, "1000"));

        ElectricalTransportFactory electricalFactory = new ElectricalTransportFactory(Voltage.FOUR_HUNDRED_FIFTEEN);
        System.out.println(electricalFactory.createMotorbike("Honda", Color.BLUE, "649"));
        System.out.println(electricalFactory.createCar("Tesla", Color.GRAY, 5, 3));




    }
}
