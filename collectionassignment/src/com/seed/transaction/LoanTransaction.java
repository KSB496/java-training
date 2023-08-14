package com.seed.transaction;

import com.seed.exception.InsufficientFundException;
import com.seed.fund.BankFund;

public class LoanTransaction implements Runnable {

	private BankFund bankFund;	
	private int customerId;
	private double loanAmount;

	public LoanTransaction(BankFund bankFund, int customerId, double loanAmount) {
		this.bankFund = bankFund;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			bankFund.checkFund(loanAmount);
			Thread.sleep((long) (2000*Math.random()));
			double fundAvailable= bankFund.debitFund(loanAmount);
			
			System.out.println(customerId+" The loan is disbursed." + " Please collect the cash from the Teller");
			System.out.println("Fund left in the bank " + fundAvailable);
		}
		catch(InsufficientFundException insufficientFundException) {
			System.out.println("Sorry!!!" + customerId + " Please try some days later as we are short of funds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	
}
