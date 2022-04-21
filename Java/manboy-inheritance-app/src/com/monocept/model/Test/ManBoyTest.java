package com.monocept.model.Test;

import com.monocept.model.Boy;
import com.monocept.model.Man;

public class ManBoyTest {
	public static void main(String args[]) {
		System.out.println("Casestudy 1");
		caseStudy1();
		System.out.println("\nCasestudy 2");
		caseStudy2();
		System.out.println("\nCasestudy 3");
		caseStudy3();
		System.out.println("\nCasestudy 4");
		caseStudy4();
		System.out.println("\nCasestudy 5");
		caseStudy5();
	}
	
	public static void caseStudy1(){
		Man x = new Man();
		x.read();
		x.play();
	}
	
	public static void caseStudy2(){
		Boy x = new Boy();
//		x.read();
//		x.play();
//		x.eat();
	}
	
	public static void caseStudy3(){
		Man x = new Boy();
		x.read();
		x.play();
	}
	
	public static void caseStudy4(){
		atThePark(new Man());
		atThePark(new Boy());
	}
	
	public static void caseStudy5(){
		Object x;
		x = 10;
		System.out.println(x.getClass().getName());
		x = 10.55f;
		System.out.println(x.getClass().getName());
		x = (10>5);
		System.out.println(x.getClass().getName());
		x = "Hello";
		System.out.println(x.getClass().getName());
		x = new Man();
		System.out.println(x.getClass().getName());
	}
	
	public static void atThePark(Man x) {
		System.out.println("At the park");
		System.out.println(x.getClass().getName());
		x.play();
	}
}
