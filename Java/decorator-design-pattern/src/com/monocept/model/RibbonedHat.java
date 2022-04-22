package com.monocept.model;

public class RibbonedHat extends HatDecorator implements Hat {

	public RibbonedHat(Hat hat) {
		super(hat);
	}
	
	@Override
	public double getPrice() {
		return 200 + hat.getPrice();
	}
	
	@Override
	public String getDetails() {
		return "Ribboned " + hat.getDetails();
	}
	
}
