package com.qa.accountApplication;

import java.util.Map.Entry;

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
	
	public int firstNameCounter(String name)
	{
		int counter = 0;
		for (Account value : repo.accountMap.values()) {
		    if(name.equals(value.getFirstName()))
		    {
		    counter++;
		    }else {
		    	break;
		    }
		}	
		return counter;
	}

}
