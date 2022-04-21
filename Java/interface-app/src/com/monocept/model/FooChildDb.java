package com.monocept.model;

public class FooChildDb extends FooDb {

	public void create() {
		System.out.println("FooChild data creating");
	}

	@Override
	public void update() {
		System.out.println("FooChild data updating");
	}

	@Override
	public void delete() {
		System.out.println("FooChild data deleting");
	}
}
