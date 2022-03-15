package Patterns.Singleton;

import java.io.*;
import java.util.*;

public class BankAccount {

	private UUID bankAccountId;
	private String owner;
	private double money;

	public BankAccount(String owner) {
		this.setBankAccountId();
		this.setOwner(owner);
	}

	public BankAccount(String owner, double money) {
		this.setBankAccountId();
		this.setOwner(owner);
		this.setMoney(money);
	}

	public UUID getBankAccountId() {
		return this.bankAccountId;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getMoney() {
		return this.money;
	}

	public void credit(double money) {
		this.money += money;
	}

	public boolean debit(double money) {
		boolean accountCantBeDebit = this.getMoney() < money;

		if(!accountCantBeDebit)
			this.money -= money;

		return accountCantBeDebit;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	private void setBankAccountId() {
		this.bankAccountId = java.util.UUID.randomUUID();
	}

	@Override
	public String toString() {
		return "\n\tAccount id :" + bankAccountId + "\n\tOwner : " + owner;
	}
}
