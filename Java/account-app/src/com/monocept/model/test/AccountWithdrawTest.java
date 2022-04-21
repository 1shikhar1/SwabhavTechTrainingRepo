package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountWithdrawTest {
	public static void main(String args[]) {

		Account acc1 = new Account(1, "Asha", 5000);
		acc1.withdraw(3000);
		printDetails(acc1);

		System.out.println();

		Account acc2 = new Account(2, "Rohan");
		acc2.withdraw(10);
		printDetails(acc2);
	}

	public static void printDetails(Account account) {
		System.out.println("Account No:\t " + account.getAccountNo());
		System.out.println("Name:\t\t " + account.getName());
		System.out.println("Balance:\t " + account.getBalance());
	}
}
