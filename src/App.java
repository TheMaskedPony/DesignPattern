import Patterns.Singleton.BankAccount;
import Patterns.Singleton.Transaction;
import Patterns.Singleton.TransactionsLogger;

public class App {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John Doe", 999999999);
        BankAccount account2 = new BankAccount("Jannette Richmond", 100000);

        TransactionsLogger logger = TransactionsLogger.getInstance();

        new Transaction(10000, account1, account2);
        new Transaction(199999, account1, account2);
        new Transaction(5000, account2, account1);
        new Transaction(5000000, account2, account1);

        System.out.println(logger.getLogs());
    }
}
