package com.monocept.model;


public class A {
	
	@NeedToRefactor
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
	@NeedToRefactor
	public void m3() {
		System.out.println("m3");
	}
	
	public void m4() {
		System.out.println("m4");
	}
}
