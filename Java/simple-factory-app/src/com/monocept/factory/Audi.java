package com.monocept.factory;

class Audi implements IAutoMobile {
	
	@Override
	public void start() {
		System.out.println("Audi has started.");
	}

	@Override
	public void stop() {
		System.out.println("Audi has stopped.");
	}
}
