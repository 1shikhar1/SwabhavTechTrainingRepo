package com.monocept.subscriber;

import com.monocept.publisher.*;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account acc, String comment) {
		System.out.println("Email notification");
		System.out.println(comment);
		System.out.println("Available balance: "+acc.getBalance());
	}

}
