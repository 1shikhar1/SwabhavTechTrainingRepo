package com.monocept.model.test;

import com.monocept.model.AccountInterface;

public class AccountInterfaceTest implements AccountInterface{
	public static void main(String args[]) {
		
		AccountInterfaceTest obj = new AccountInterfaceTest();
		
		obj.printDetails();
	}

	@Override
	public void printDetails() {
		System.out.println(accountNo);
		System.out.println(name);
		System.out.println(salary);
		
	}
}
