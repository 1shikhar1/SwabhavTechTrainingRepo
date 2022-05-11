package com.async.test;

public class PrintTimeStamp extends Thread {
	
	public void print() {
		PrintTimeStamp stamp = new PrintTimeStamp(); 
		stamp.start();
	}
	
	public void run() {
		while(true)
		System.out.println(java.time.LocalDateTime.now());
	}
}
