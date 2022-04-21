package com.monocept.model;

public abstract class Account{

	private final int accountNo;
	private final String name;
	private final String type;
	protected double balance;
	
	public abstract void withdraw(double amount);

	public Account(int accountNo,String type, String name, int balance) {
		this.accountNo = accountNo;
		this.type = type;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposite(double amount) {
		balance += amount;
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
	public String getType() {
		return type;
	}

}
