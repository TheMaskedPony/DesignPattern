package Patterns.Singleton;

import java.io.*;
import java.util.*;

public class TransactionsLogger {

	private static final TransactionsLogger instance = new TransactionsLogger();
	private final List<Transaction> logs;

	private TransactionsLogger() {
		this.logs = new ArrayList<>();
	}

	// Lock par double conditions / instanciation par défaut / synchronized voir doc
	public static TransactionsLogger getInstance() {
		return instance;
	}

	public void log(Transaction transaction) {
		this.logs.add(transaction);
	}

	public List<Transaction> getLogs() {
		return this.logs;
	}

	public String toString() {
		return this.logs.toString();
	}

}
