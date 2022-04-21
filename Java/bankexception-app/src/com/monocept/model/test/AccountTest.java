package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String args[]) {
		caseStudy2();
		System.out.println();
		
		caseStudy1();
	}
	
	public static void caseStudy1() {
		Account acc1 = new Account(1, "Asha", 5000);
		acc1.withdraw(4600);
		printDetails(acc1);
	}
	
	public static void caseStudy2() {
		Account acc2 = new Account(2, "Rohan",2000);
		try {
			acc2.withdraw(1700);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		printDetails(acc2);
	}

	public static void printDetails(Account account) {
		System.out.println("Account No:\t " + account.getAccountNo());
		System.out.println("Name:\t\t " + account.getName());
		System.out.println("Balance:\t " + account.getBalance());
	}
}
