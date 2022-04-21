package com.monocept.model;

public class CurrentAccount extends Account{
	private static final int minBalance = -10000;
	public CurrentAccount(int accountNo, String name, int balance) {
		super(accountNo,"Current", name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if(this.balance-amount>=minBalance)
			this.balance -= amount;
	}
}
