package com.monocept.customException;

public class NegativeValueNotAllowed extends RuntimeException {

	String message;
	public NegativeValueNotAllowed(String string) {
		message = string;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
