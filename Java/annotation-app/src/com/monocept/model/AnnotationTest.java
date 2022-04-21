package com.monocept.model;

import java.lang.reflect.*;

public class AnnotationTest {
	
	public static void main(String args[]) {
		
		findMethodsNeedToReactor(A.class);
	}
	
	public static void findMethodsNeedToReactor(Class className) {
		Method[] methods = className.getMethods();
		
		for(Method method : methods) {
			if(method.isAnnotationPresent(NeedToRefactor.class)) {
				System.out.println("Method: "+method.getName());
			}
		}
	}
}