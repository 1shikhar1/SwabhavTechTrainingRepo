package com.monocept.factory;

public class Audi implements IAuto {
	
	@Override
	public void start() {
		System.out.println("Audi has started.");
	}

	@Override
	public void stop() {
		System.out.println("Audi has stopped.");
	}

}
