package com.seed.exception;

public class UnAuthorizedWithdrawTransactionException extends Exception {

	public UnAuthorizedWithdrawTransactionException() {
		super("The user is unauthorized for the withdrawal");
		// TODO Auto-generated constructor stub
	}
	
}
