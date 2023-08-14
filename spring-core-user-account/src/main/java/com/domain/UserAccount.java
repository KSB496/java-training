package com.domain;

import org.springframework.beans.factory.annotation.Value;

public class UserAccount {

	@Value(value="101")
	private int accountNumber;
	@Value(value="Thomas")
	private String ownerName;
	@Value(value="10000")
	private double balance;
	@Value(value="Credit")
	private String accountType;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "UserAccount [accountNumber=" + accountNumber + ", ownerName=" + ownerName + ", balance=" + balance
				+ ", accountType=" + accountType + "]";
	}
	
	public void display() {
		System.out.println(accountNumber);
		System.out.println(ownerName);
		System.out.println(balance);
		System.out.println(accountType);
	}
}
