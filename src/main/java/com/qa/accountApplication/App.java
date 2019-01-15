package com.qa.accountApplication;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Service service = new Service();
    	Account account1 = new Account("Umayr", "Nightmayr", 0);
    	Account account2 = new Account("Matt", "Trainerman", 1);
    	Account account3 = new Account("Jordan", "Totalbiscuit", 2);
    	
    	service.addAccount(0, account1);
    	service.addAccount(1, account2);
    	service.addAccount(2, account3);
  
        System.out.println(service.getAccount(0));
        
        service.deleteAccount(1);
        
        System.out.println(service.getAccount(1));
    }
}
