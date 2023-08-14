package com.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("uacc")
public class UserAccount {
	@Value(value="123")
	private int accountNumber;
	@Value(value="Crystal Wen")
	private String ownerName;
	@Value(value="10000")
	private double balance;
	@Value(value="h")
	private char accountType;
	public int getAccountNumber() {
		return accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public char getAccountType() {
		return accountType;
	}
	
	
}
