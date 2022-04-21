package com.monocept.model;

public class SavingAccount extends Account{
	private static final int minBalance = 500;
	
	public SavingAccount(int accountNo, String name, int balance) {
		super(accountNo,"Saving", name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if(this.balance-amount>=minBalance)
			this.balance -= amount;
	}


}
