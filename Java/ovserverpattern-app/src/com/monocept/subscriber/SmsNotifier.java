package com.monocept.subscriber;

import com.monocept.publisher.Account;
import com.monocept.publisher.INotifier;

public class SmsNotifier implements INotifier {

	@Override
	public void notify(Account acc, String comment) {
		
		System.out.println("Sms notification");
		System.out.println(comment);
		System.out.println("Available balance: "+acc.getBalance());
	}

}
