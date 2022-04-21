package com.monocept.model;

public abstract class FooDb implements IDataAccessible {
	@Override
	public void read() {
		System.out.println("Foo data reading");
	}
}
