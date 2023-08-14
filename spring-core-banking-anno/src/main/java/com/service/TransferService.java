package com.service;

import com.repo.AccountRepo;

public interface TransferService {

	public void transferFunds(double amount, String srcAccount, String destAccount);
	public AccountRepo getRepo();
}
