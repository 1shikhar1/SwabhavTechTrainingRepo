package com.monocept.model.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingAccount;

public class AccountTest {
	public static void main(String args[]) {
		
		Account accounts[] = new Account[]{new CurrentAccount(1,"Rohan",8000),new CurrentAccount(2,"Asha",18000),new SavingAccount(1,"Shikhar",600)};
		
		printDetails(accounts);
		
		CurrentAccount vineet = new CurrentAccount(3,"Vineet",20000); 
		printDetails(vineet);
	}
	
	public static void printDetails(Account accounts[]) {
		
		for(Account acc: accounts) {
			printDetails(acc);
		}
	}
	
	public static void printDetails(Account account) {
		System.out.println("Account No:\t " + account.getAccountNo());
		System.out.println("Account type:\t " + account.getClass().getSimpleName());
		System.out.println("Name:\t\t " + account.getName());
		System.out.println("Balance:\t " + account.getBalance());
		System.out.println();
	}
}
