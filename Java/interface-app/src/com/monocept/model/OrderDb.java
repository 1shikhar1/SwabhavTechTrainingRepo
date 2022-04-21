package com.monocept.model;

public class OrderDb implements IDataAccessible {
	@Override
	public void read() {
		System.out.println("Order data reading");
	}

	@Override
	public void create() {
		System.out.println("Order data creating");
	}

	@Override
	public void update() {
		System.out.println("Order data updating");
	}

	@Override
	public void delete() {
		System.out.println("Order data deleting");
	}
}
