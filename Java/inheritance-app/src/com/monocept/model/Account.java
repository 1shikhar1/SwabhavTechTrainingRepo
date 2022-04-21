package com.monocept.model;

public class Account {
	private static final int minBalance = 500;

	private final int accountNo;
	private final String name;
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
	
	public String toString() {
		String details = "";
		details = details +  "Acount No: "+accountNo+"\n";
		details = details +  "Name: "+name+"\n";
		details = details +  "Balance: "+balance+"\n";
		
		details = details + super.toString();
		return details;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account acc = (Account)obj;
		return (accountNo==acc.accountNo && name==acc.name && balance==acc.balance);
	}

}
