package com.exception;

public class SoldOutException extends RuntimeException {
	
	String message;

	public SoldOutException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	

}
