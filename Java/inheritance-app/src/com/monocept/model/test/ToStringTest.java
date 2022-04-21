package com.monocept.model.test;

import com.monocept.model.Account;

public class ToStringTest {
	public static void main(String args[]) {
		Account acc1 = new Account(101,"Rohan",5000);
		System.out.println(acc1);
		System.out.println(acc1.toString());
	}
}
