package com.monocept.streams.test;

public class Account implements Comparable<Account>{
	private static final int minBalance = 500;

	private final int accountNo;
	private final String name;
	private double balance;
	private static int counter;
	
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
	
	public static void incrementCounter() {
		counter++;
	}
	
	public int getCounter() {
		return counter;
	}
	
	public static int getHeadCounter() {
		return counter;
	}

	@Override
	public int compareTo(Account obj) {
		if(balance==obj.getBalance())  
			return 0;  
		else if(balance>obj.getBalance())  
			return 1;  
		else  
			return -1;  
	}
	
	@Override
	public String toString() {
		String details = "";
		
		details += "Name: "+name+"\n";
		details += "Account No: "+accountNo+"\n";
		details += "Balance: "+balance;
		
		return details;
	}

}
