package com.monocept.model.test;

import com.monocept.model.Service;

public class ServiceTest extends Thread {

	public static void main(String args[]) {
		
		Thread t1 = new Thread(()-> {
			Service service1 = Service.getInstance();
			service1.printMessage();
			service1.doWork1();
		});
		
		Thread t2 = new Thread(()-> {
			Service service2 = Service.getInstance();
			service2.printMessage();
			service2.doWork2();
		});
		
		Thread t3 = new Thread(()-> {
			Service service3 = Service.getInstance();
			service3.printMessage();
			service3.doWork3();
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}
