package com.qa.accountApplication;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Repo r = new Repo();
    	Service s = new Service();
    	Account account1 = new Account("Umayr", "Nightmayr", 0);
    	Account account2 = new Account("Matt", "Trainerman", 1);
    	Account account3 = new Account("Jordan", "Totalbiscuit", 2);
    	
    	s.addAccount(account1);
    	s.addAccount(account2);
    	s.addAccount(account3);
  
        s.getAccount(account1);
        
        s.deleteAccount(account2);
        
        s.getAccount(account2);
    }
}
