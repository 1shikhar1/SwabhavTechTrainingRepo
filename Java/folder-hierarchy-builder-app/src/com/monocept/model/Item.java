package com.monocept.model;

public class Item {
	private String id;
	private String name;
	private String parentId;
	private String type;
	
	public Item(String id, String name, String parentId, String type) {
		this.id = id;
		this.name = name;
		this.parentId = parentId;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getParentId() {
		return parentId;
	}
	
	public String getType() {
		return type;
	}
}
