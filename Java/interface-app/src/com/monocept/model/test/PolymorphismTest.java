package com.monocept.model.test;

import com.monocept.model.*;

public class PolymorphismTest {
	public static void main(String args[]) {
		doDbOperations(new CustomerDb());
		System.out.println();
		
		doDbOperations(new DepartmentDb());
		System.out.println();
		
		doDbOperations(new OrderDb());
		System.out.println();
		
		doDbOperations(new FooChildDb());
	}

	static void doDbOperations(IDataAccessible obj) {
		System.out.println("Doing db operations");

		obj.create();
		obj.update();
		obj.read();
		obj.delete();
	}
}
