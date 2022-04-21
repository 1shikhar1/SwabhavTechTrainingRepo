package com.monocept.factory.test;

import com.monocept.factory.*;

public class AutoMobileTest {
	public static void main(String args[]) {
		
		AutomobileFactory factory1 = AutomobileFactory.getInstance();
		
		IAutoMobile product = factory1.make(AutoType.BMW);
		
		product.start();
		product.stop();
		System.out.println("Class: "+product.getClass().getSimpleName()+"\n");
		
		
		product = factory1.make(AutoType.TESLA);
		product.start();
		product.stop();
		System.out.println("Class: "+product.getClass().getSimpleName()+"\n");
		
		AutomobileFactory factory2 = AutomobileFactory.getInstance();
		
		product = factory2.make(AutoType.AUDI);
		product.start();
		product.stop();
		System.out.println("Class: "+product.getClass().getSimpleName()+"\n");
		
		System.out.println("is both factory objects same: "+factory1.equals(factory2));
		
	}
}
