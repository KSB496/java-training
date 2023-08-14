package com.seed.transaction;

import com.seed.account.Account;

public class DepositTransaction extends Thread{

	private int transactionId;
	private Account account;
	private double amount;
	private int customerId;
	public DepositTransaction(int transactionId, Account account, double amount, int customerId) {
		super();
		this.transactionId = transactionId;
		this.account = account;
		this.amount = amount;
		this.customerId = customerId;
	}
	public synchronized void deposit(Account account, double amount) {
		account.setBalance(account.getBalance()+amount);
	}
	public void run() {
		System.out.println("deposit thread is started");
		deposit(account,amount);
		System.out.println(transactionId + " transaction completed!!!" + customerId + " Thank you for depositing " + amount + " to the Account " + account.getAccountNo());
		System.out.println("deposit thread is ended");
	}
}
