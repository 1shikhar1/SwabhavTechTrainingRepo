package com.monocept.test;

import com.monocept.publisher.Account;
import com.monocept.subscriber.*;

public class Test {
	public static void main(String args[]) {
		Account acc1 = new Account(100, "Rohan", 25000);
		
		acc1.deposite(10000);
		
		acc1.addNotifier(new SmsNotifier());
		acc1.addNotifier(new EmailNotifier());
		acc1.addNotifier(new WhatsappNotifier());
		
		acc1.withdraw(3000);;
	}
}
