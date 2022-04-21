package com.monocept.publisher;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private static final int minBalance = 500;

	private final int accountNo;
	private final String name;
	private double balance;
	private static int counter;
	private List<INotifier> notifiers = new ArrayList<INotifier>();
	
	static {
		counter = 100;
//		System.out.println("inside static block");
	}

	public Account(int accountNo, String name) {
		this(accountNo, name, minBalance);
	}

	public Account(int accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
		incrementCounter();
//		System.out.println("inside constructor block");
	}

	public void deposite(double amount) {
		balance += amount;
		
		String comment = "You have deposited Rs."+amount;
		
		if(notifiers!=null)
		for(INotifier notifier : notifiers)
			notifier.notify(this, comment);
	}

	public void withdraw(double amount) {
		if ((balance - amount) >= minBalance) 
			balance -= amount;
		
		String comment = "You have whithdrawn Rs."+amount;
		
		if(notifiers!=null)
		for(INotifier notifier : notifiers)
			notifier.notify(this,comment);
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
	
	public static void incrementCounter() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public void addNotifier(INotifier notifier) {
		notifiers.add(notifier);
	}

}
