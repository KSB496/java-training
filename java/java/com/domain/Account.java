package com.domain;

public class Account {
	private String id;
	private double balance;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	public void debit(double amount) {
		balance -= amount;
	}
	public void credit(double amount) {
		balance += amount;
	}
	public static Account copy(Account src) {
		return new Account(src.getId(), src.getBalance());
	}
	@Override
	public String toString() {
		return "Account [id="+id+", balance="+String.format("%.2f", balance)+"]";
	}
}
