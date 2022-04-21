package com.monocept.factory;

public class Tesla implements IAuto {

	@Override
	public void start() {
		System.out.println("Tesla has started.");
	}

	@Override
	public void stop() {
		System.out.println("Tesla has stopped.");
	}
}
