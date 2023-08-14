package com.repo;

import java.util.Set;

import com.domain.Account;

public interface AccountRepo {

	public Account findById(String accId);
	public void update(Account account);
	public void add(Account account);
	public Set<Account> findAll();
}
