package com.framework.exception;

public class AppException extends Exception {
	
	protected String expId;
	
	public AppException() {
		this.expId = null;
	}

	public AppException(String expId) {
		super();
		this.expId = expId;
	}
	

}
