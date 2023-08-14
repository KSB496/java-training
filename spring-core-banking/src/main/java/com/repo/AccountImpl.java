package com.repo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.domain.Account;

public class AccountImpl implements AccountRepo {
	
	Map<String, Account> accById = new HashMap<String, Account>();

	@Override
	public Account findById(String accId) {
		// TODO Auto-generated method stub
		return Account.copy(accById.get(accId));
	}

	@Override
	public void update(Account account) {
		// TODO Auto-generated method stub
		if(!accById.containsKey(account.getId())) {
			throw new IllegalArgumentException("Account ID" + account.getId() + " Not Found");
		}
		accById.put(account.getId(), Account.copy(account));
	}

	@Override
	public void add(Account account) {
		// TODO Auto-generated method stub
		if(accById.containsKey(account.getId())) {
			throw new IllegalArgumentException("Account ID" + account.getId() + "Already Exists");
		}
		accById.put(account.getId(), Account.copy(account));
	}

	@Override
	public Set<Account> findAll() {
		// TODO Auto-generated method stub
		HashSet<Account> hs = new HashSet<Account>();
		for(Account account : accById.values())
			hs.add(Account.copy(account));
			return hs;	
	}

}
