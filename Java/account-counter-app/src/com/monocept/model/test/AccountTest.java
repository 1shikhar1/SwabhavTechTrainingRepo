package com.monocept.model.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String args[]) {
		Account acc1 = new Account(10,"Asha",1000);
		System.out.println(acc1.getCounter());
		System.out.println(Account.getHeadCounter());
		
		Account acc2 = new Account(20,"Rohan");
		System.out.println(acc1.getCounter());
		System.out.println(Account.getHeadCounter());
		
		Account acc3 = new Account(30,"Shikhar",2000);
		System.out.println(acc1.getCounter());
		System.out.println(Account.getHeadCounter());
	}
}
