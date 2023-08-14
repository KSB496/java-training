package com.exception;

public class NotfullPaidException extends RuntimeException {

	private String message;
	private long remaining;
	public NotfullPaidException(String message, long remaining) {
		super();
		this.message = message;
		this.remaining = remaining;
	}
	
	@Override
	public String getMessage() {
		return message + remaining;
	}
	public long getRemaining() {
		return remaining;
	}
	
	
}
