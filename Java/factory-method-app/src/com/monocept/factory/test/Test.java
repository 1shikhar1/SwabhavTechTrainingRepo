package com.monocept.factory.test;

import com.monocept.factory.*;

public class Test {
	public static void main(String args[]) {
		IAutoFactory factory;
		factory = TeslaFactory.getInstance();
		IAuto auto = factory.make();
		
		auto.start();
		auto.stop();
	}
}
