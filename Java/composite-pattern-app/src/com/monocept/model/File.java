package com.monocept.model;

public class File implements IStorageItem {
	String name;
	String size;
	
	public File(String name, String size) {
		this.name = name;
		this.size = size;
	}
	@Override
	public void showHierarchy(int indent) {
		for (int i = 0; i < indent; i++) {
			System.out.print("   ");
	    }
		System.out.print("Name: "+name+", Size: "+size);
		System.out.println();
	}

}
