package com.monocept.model;

public abstract class HatDecorator implements Hat {
	protected Hat hat;
	
	public HatDecorator(Hat hat) {
		this.hat = hat;
	}
	
	@Override
	public String getName() {
		return hat.getName();
	}
}
