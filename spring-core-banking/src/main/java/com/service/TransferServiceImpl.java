package com.service;

import com.domain.Account;
import com.repo.AccountRepo;

public class TransferServiceImpl implements TransferService {

	private AccountRepo repo;
	
	public TransferServiceImpl(AccountRepo repo) {
		this.repo = repo;
	}

	@Override
	public void transferFunds(double amount, String srcAccount, String destAccount) {
		// TODO Auto-generated method stub
		Account srcAcc = repo.findById(srcAccount);
		Account destAcc = repo.findById(destAccount);
		
		srcAcc.debit(amount);
		destAcc.credit(amount);
		repo.update(srcAcc);
		repo.update(destAcc);
	}

}
