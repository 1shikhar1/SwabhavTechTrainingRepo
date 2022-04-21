package com.monocept.model;

public class B {
	public void m1() {
		System.out.println("m1");
	}
	
	@NeedToRefactor
	public void m2() {
		System.out.println("m2");
	}
}
