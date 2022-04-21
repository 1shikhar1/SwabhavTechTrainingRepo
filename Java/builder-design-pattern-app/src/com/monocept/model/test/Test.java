package com.monocept.model.test;

import com.monocept.model.*;

public class Test {
	public static void main(String args[]) {
		
		Laptop l1 = new LaptopBuilder()
				.addRam("SandDisk")
				.addHdd("Toshiba")
				.addKeyboard("Quantom")
				.addMouse("i-ball")
				.getLaptop();
		
		System.out.println(l1.getDetails());
	}
}
