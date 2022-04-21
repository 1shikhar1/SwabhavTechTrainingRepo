package com.monocept.model;

public class CustomerDb implements IDataAccessible {

	@Override
	public void read() {
		System.out.println("Customer data reading");
	}

	@Override
	public void create() {
		System.out.println("Customer data creating");
	}

	@Override
	public void update() {
		System.out.println("Customer data updating");
	}

	@Override
	public void delete() {
		System.out.println("Customer data deleting");
	}
}
