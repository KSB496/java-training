package com.seed.transaction;

import com.seed.account.Account;
import com.seed.customer.Customer;
import com.seed.exception.InsufficientBalanceException;
import com.seed.exception.UnAuthorizedWithdrawTransactionException;
import com.seed.security.Security;

public class WithdrawTransaction extends Security implements Runnable{

	private int transactionId;
	private Account account;
	private Customer customer;
	private double amount;
	
	public WithdrawTransaction(int transactionId, Account account, Customer customer, double amount) {
		super();
		this.transactionId = transactionId;
		this.account = account;
		this.customer = customer;
		this.amount = amount;
	}

	public synchronized double withdraw(Account account, double amount) throws InsufficientBalanceException {
		if(account.getBalance()>=amount) {
			account.setBalance(account.getBalance()-amount);
		}else {
			throw new InsufficientBalanceException();
		}
		return account.getBalance();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("withdraw thread is started");
			authorization(account, customer);
			double balance = withdraw(account, amount);
			System.out.println(transactionId + "Transaction Completed...The balance amount is : " + balance);
			System.out.println("withdraw thread is ended");
		}catch(UnAuthorizedWithdrawTransactionException unAuthorizedWithdrawTransactionException) {
			System.out.println(transactionId + "Transaction Failed..and " + unAuthorizedWithdrawTransactionException.getMessage());
		}catch(InsufficientBalanceException insufficientBalanceException) {
			System.out.println(transactionId + "Transaction failed...and your account has insufficient balance : ");
			
		}
	}

}
