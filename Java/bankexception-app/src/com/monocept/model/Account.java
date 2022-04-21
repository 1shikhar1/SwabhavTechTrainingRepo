package com.monocept.model;

public class Account implements java.io.Serializable{
	private static final int minBalance = 500;

	private final int accountNo;
	private final transient String name;
	private double balance;

	public Account(int accountNo, String name) {
		this(accountNo, name, minBalance);
	}

	public Account(int accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposite(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if ((balance - amount) >= minBalance) 
			balance -= amount;
		else 
			throw new InsufficientFundsException(this);
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

}
