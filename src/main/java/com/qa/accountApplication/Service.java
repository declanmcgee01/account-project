package com.qa.accountApplication;



public class Service {
		
	public Repo repo = new Repo();
	
	public void addAccount(int key, Account acc)
	{
		repo.accountMap.put(key, acc);
	}
	
	public Account getAccount(int key)
	{
		return repo.accountMap.get(key);
	}
	
	public void deleteAccount(int key)
	{
		repo.accountMap.remove(key);
	}

}
