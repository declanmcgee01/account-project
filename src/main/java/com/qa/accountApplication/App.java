package com.qa.accountApplication;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Gson gson = new GsonBuilder().create();
    	Service service = new Service();
    	Account account1 = new Account("Umayr", "Nightmayr", 0);
    	Account account2 = new Account("Matt", "Trainerman", 1);
    	Account account3 = new Account("Jordan", "Totalbiscuit", 2);
    	
    	service.addAccount(0, account1);
    	service.addAccount(1, account2);
    	service.addAccount(2, account3);
        
        gson.toJson(service.repo.accountMap, System.out);
        
    }
}
