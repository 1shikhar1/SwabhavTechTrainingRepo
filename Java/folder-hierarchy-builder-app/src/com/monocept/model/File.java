package com.monocept.model;

public class File implements IStorageItem {
	String name;

	
	public File(String name) {
		this.name = name;
	}
	@Override
	public void showHierarchy(int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print("   ");
	    }
		System.out.print("Name: "+name);
		System.out.println();
	}

}
