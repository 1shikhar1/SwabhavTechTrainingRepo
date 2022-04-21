package com.monocept.model;

public class DepartmentDb implements IDataAccessible {
	@Override
	public void read() {
		System.out.println("Department data reading");
	}

	@Override
	public void create() {
		System.out.println("Department data creating");
	}

	@Override
	public void update() {
		System.out.println("Department data updating");
	}

	@Override
	public void delete() {
		System.out.println("Department data deleting");
	}
}
