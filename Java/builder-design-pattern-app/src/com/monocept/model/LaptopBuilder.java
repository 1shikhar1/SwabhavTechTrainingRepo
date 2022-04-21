package com.monocept.model;

public class LaptopBuilder {
	Laptop laptop;
	
	public LaptopBuilder() {
		laptop = new Laptop();
	}
	
	
	public LaptopBuilder addRam(String type) {
		laptop.ram = type;
		return this;
	}
	
	
	public LaptopBuilder addHdd(String type) {
			laptop.hdd = type;
			return this;
		}
	
	public LaptopBuilder addKeyboard(String type) {
		laptop.keyboard = type;
		return this;
	}
	
	public LaptopBuilder addMouse(String type) {
		laptop.mouse = type;
		return this;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}
}
