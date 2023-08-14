package com.exception;

public class NotSuffChangeException extends RuntimeException {
	
	private String message;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

	public NotSuffChangeException(String message) {
		super();
		this.message = message;
	}
	
	
}
