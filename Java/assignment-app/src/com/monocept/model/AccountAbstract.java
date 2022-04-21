package com.monocept.model;

public abstract class AccountAbstract {
	public static final int accountNo = 100;
	public static final String name = "Rohan";
	public static final int salary = 10000;
	
	abstract void printDetails();
	
	public void info() {
		System.out.println("This method doesn't need to override");
	}
}
