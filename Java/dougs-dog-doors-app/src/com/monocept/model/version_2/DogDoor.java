package com.monocept.model.version_2;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The Dog Door opens");
		open = true;
	}
	
	public boolean isOpen() {
		return open;
	}

	public void close() {
		System.out.println("The Dog Door Close.");
		open = false;
	}
}