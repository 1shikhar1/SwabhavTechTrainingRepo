package com.monocept.model;

import java.time.Instant;
import java.util.*;

public class Account implements java.io.Serializable{
	private static final int minBalance = 500;

	private final int accountNo;
	private final transient String name;
	private double balance;
	private List<Transaction> transactions = new ArrayList<Transaction>();

	public Account(int accountNo, String name) {
		this(accountNo, name, minBalance);
	}

	public Account(int accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposite(double amount) {
		transactions.add(new Transaction(Instant.now(),"Deposite",amount));
		balance += amount;
	}

	public void withdraw(double amount) {
		if ((balance - amount) >= minBalance) {
			transactions.add(new Transaction(Instant.now(),"Withdraw",amount));
			balance -= amount;
		}
			
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
	
	public List<Transaction> getTransactions(){
		return transactions;
	}

}
