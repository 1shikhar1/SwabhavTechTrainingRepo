package com.monocept.model;

public class Man {
	static {
		System.out.println("Man's static block");
	}

	public void read() {
		System.out.println("Man is reading");
	}

	public void play() {
		System.out.println("Man is playing");
	}

}
