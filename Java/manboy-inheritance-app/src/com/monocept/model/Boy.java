package com.monocept.model;

public class Boy extends Man{
	static {
		System.out.println("Boy's static block");
	}
	@Override
	public void play() {
		System.out.println("Boy is playing");
	}
	
	public void eat() {
		System.out.println("Boy is eating");
	}
}
