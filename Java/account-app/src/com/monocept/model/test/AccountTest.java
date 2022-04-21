package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.Transaction;

public class AccountTest {
	public static void main(String args[]) {
		Account shikhar = new Account(1000,"Shikhar",75000);
		shikhar.withdraw(10000);
		shikhar.withdraw(8000);
		shikhar.deposite(24000);
		shikhar.withdraw(4000);
		shikhar.deposite(6000);
		
		for(Transaction transaction: shikhar.getTransactions()) {
			System.out.println(transaction);
		}
	}
}
