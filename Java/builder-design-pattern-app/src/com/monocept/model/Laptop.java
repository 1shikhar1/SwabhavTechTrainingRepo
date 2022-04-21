package com.monocept.model;

public class Laptop {
	String ram;
	String hdd;
	String keyboard;
	String mouse;
	
	public String getDetails() {
		String details = "";
		
		details += "Ram: "+ram+"\n";
		details += "HDD: "+hdd+"\n";
		details += "Keyboard: "+keyboard+"\n";
		details += "Mouse: "+mouse+"\n";
		
		return details;
	}
}
