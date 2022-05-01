package com.monocept.model.customexception;

public class CellMarkedRuntimeException extends RuntimeException {
	String message;
	
	public CellMarkedRuntimeException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
