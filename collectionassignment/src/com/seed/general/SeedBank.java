package com.seed.general;

import com.seed.fund.BankFund;
import com.seed.transaction.LoanTransaction;

public class SeedBank {

	public static void main(String[] args) {
		
		BankFund seedBankFund = new BankFund(9000000);
		
		LoanTransaction[] loanTransactions = new LoanTransaction[100];
		
		for(int index=0;index<loanTransactions.length;index++) {
			loanTransactions[index] = new LoanTransaction(seedBankFund, (100+index), 250000);
		}
		
		for(int index=0;index<loanTransactions.length;index++) {
			loanTransactions[index].run();
		}
	}
}
