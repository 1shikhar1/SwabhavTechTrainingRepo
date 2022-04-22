package com.monocept.model;

public class StandardHat implements Hat {

	@Override
	public String getName() {
		return "Standard hat";
	}

	@Override
	public double getPrice() {
		return 300;
	}

	@Override
	public String getDetails() {
		return "Standard hat";
	}

}
