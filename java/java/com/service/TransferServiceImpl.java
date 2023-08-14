package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.domain.Account;
import com.repo.AccountRepo;

@Component("ts")
public class TransferServiceImpl implements TransferService{
	@Autowired
	@Qualifier("ar")
	private AccountRepo repo;

	public TransferServiceImpl(AccountRepo repo) {
		super();
		this.repo = repo;
	}



	public AccountRepo getRepo() {
		return repo;
	}



	@Override
	public void transferFunds(double amount, String srcAccount, String dstAccount) {
		Account srcAcc = repo.findById(srcAccount);
		Account dstAcc = repo.findById(dstAccount);
		
		srcAcc.debit(amount);
		dstAcc.credit(amount);
		
		repo.update(srcAcc);
		repo.update(dstAcc);
	}
}
