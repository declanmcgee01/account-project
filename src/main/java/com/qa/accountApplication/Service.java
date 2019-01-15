package com.qa.accountApplication;


import java.util.HashMap;
import java.util.Map;

public class Service {
	
	
	
	Map<Integer, Account> accountMap = new HashMap();
	
	public void addAccount(Account acc)
	{
		accountMap.put(acc.getAccountNumber(), acc);
	}
	
	public Account getAccount(Account acc)
	{
		return accountMap.get(acc.getAccountNumber());
	}
	
	public void deleteAccount(Account acc)
	{
		accountMap.remove(acc.getAccountNumber());
	}

}
