package com.monocept.model;

import java.util.*;

public class Folder implements IStorageItem {
	String name;

	List<IStorageItem> children = new ArrayList<IStorageItem>();
	
	public Folder(String name) {
		this.name = name;
	}

	@Override
	public void showHierarchy(int indent) {
		
		for (int i = 0; i < indent; i++) {
			System.out.print("   ");
	    }
		
		System.out.print("["+name+"]");
		System.out.println();

		indent++;
		showChildrenHierarchy(indent);
	}
	
	public void addChild(IStorageItem child) {
		children.add(child);
	}
	
	public void showChildrenHierarchy(int indent) {
		for(IStorageItem item: children) {
			
			item.showHierarchy(indent);
		}
	}
	

}
