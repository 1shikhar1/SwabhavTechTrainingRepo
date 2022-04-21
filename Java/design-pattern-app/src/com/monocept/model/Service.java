package com.monocept.model;

public class Service {
	private static Service instance;
	
	private Service() {
		System.out.println("Inside service constructor");
	}
	
	public static synchronized Service getInstance() {
		if(instance==null)
		{
			instance = new Service();
			return instance;
		}
		return instance;
	}
	
	public void doWork1() {
		System.out.println("Doing work 1");
	}
	
	public void doWork2() {
		System.out.println("Doing work 2");
	}
	
	public void doWork3() {
		System.out.println("Doing work 3");
	}
	
	public void printMessage() {
		System.out.println("Hash code: "+this.hashCode());
	}
}
