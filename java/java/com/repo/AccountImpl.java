package com.repo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.domain.Account;

@Component("ar")
public class AccountImpl implements AccountRepo{
	Map<String, Account> accById = new HashMap<String, Account>();
	
	@Override
	public Account findById(String accId) {
		return Account.copy(accById.get(accId));
	}
	
	@Override
	public void update(Account account) {
		if (!accById.containsKey(account.getId() )) {
			throw new IllegalArgumentException("Account ID " + account.getId() + " not found");
		}
		accById.put(account.getId(), Account.copy(account));
	}
	
	@Override
	public void add(Account account) {
		if (accById.containsKey(account.getId() )) {
			throw new IllegalArgumentException("Account ID " + account.getId() + " already exists");
		}
		accById.put(account.getId(), Account.copy(account));
		
	}
	
	@Override
	public Set<Account> findAll() {
		HashSet<Account> hs = new HashSet<Account>();
		for (Account act: accById.values() )
			hs.add(Account.copy(act));
		return hs;
	}
}
