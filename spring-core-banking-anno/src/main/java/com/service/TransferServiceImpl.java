package com.service;

import org.springframework.stereotype.Component;

import com.domain.Account;
import com.repo.AccountImpl;
import com.repo.AccountRepo;

@Component("ts")
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

	@Override
	public AccountRepo getRepo() {
		// TODO Auto-generated method stub
		return this.repo;
	}

}
