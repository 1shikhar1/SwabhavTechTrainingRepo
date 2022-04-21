package com.monocept.factory;

public class Bmw implements IAuto {
	
	@Override
	public void start() {
		System.out.println("Bmw has started.");
	}

	@Override
	public void stop() {
		System.out.println("Bmw has stopped.");
	}
}
