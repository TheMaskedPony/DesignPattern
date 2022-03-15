package Patterns.Singleton;

import java.io.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.logging.Logger;

public class Transaction {

	private UUID transactionId;
	private static long transactionsIndex;
	private BankAccount sourceAccount;
	private BankAccount destinationAccount;
	private double moneyAmount;
	private LocalDateTime timestamp;
	private final boolean isRefused;

	public Transaction(double money, BankAccount from, BankAccount to) {
		this.setNowInTimestamp();
		this.setTransactionId();
		this.setMoneyAmount(money);
		this.setSourceAccount(from);
		this.setDestinationAccount(to);
		this.isRefused = this.getSourceAccount().debit(this.getMoneyAmount());

		if(!this.isRefused())
			this.getDestinationAccount().credit(this.getMoneyAmount());

		TransactionsLogger.getInstance().log(this);
	}

	public UUID getTransactionId() {
		return this.transactionId;
	}

	public BankAccount getSourceAccount() {
		return this.sourceAccount;
	}

	public BankAccount getDestinationAccount() {
		return this.destinationAccount;
	}

	public double getMoneyAmount() {
		return this.moneyAmount;
	}

	public LocalDateTime getTimestamp() {
		return this.timestamp;
	}

	public boolean isRefused() {
		return isRefused;
	}

	public void setSourceAccount(BankAccount sourceAccount) {
		this.sourceAccount = sourceAccount;
	}

	public void setDestinationAccount(BankAccount destinationAccount) {
		this.destinationAccount = destinationAccount;
	}

	public void setMoneyAmount(double moneyAmount) {
		this.moneyAmount = moneyAmount;
	}

	private void setTransactionId() {
		this.transactionId = UUID.randomUUID();
	}

	@Override
	public String toString() {
		return  "\n-------------------------------------------\n" +
				"Transaction id : " + transactionId +
				"\n Source account : " + sourceAccount.toString() +
				"\n Destination account : " + destinationAccount.toString() +
				"\n Money amount : " + moneyAmount +
				"\n Datetime :" + timestamp +
				"\n Transaction status : " + (isRefused ? "Failed" : "Success") +
				"\n------------------------------------------\n";
	}

	private void setNowInTimestamp() {
		this.timestamp = LocalDateTime.now();
	}
}
