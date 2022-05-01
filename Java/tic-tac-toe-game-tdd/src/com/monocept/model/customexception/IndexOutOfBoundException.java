package com.monocept.model.customexception;

public class IndexOutOfBoundException extends RuntimeException {
	String message;
	
	public IndexOutOfBoundException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
