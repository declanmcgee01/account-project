package com.qa.accountApplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	
	public Service service;
	public Account account1;
	public Account account2;
	public Account account3;
	
	@Before
	public void setUp()
	{
		service = new Service();
    	account1 = new Account("Umayr", "Nightmayr", 0);
    	account2 = new Account("Matt", "Trainerman", 1);
    	account3 = new Account("Jordan", "Totalbiscuit", 2);	
	}
	
	@Test
    public void testAddAccount()
    {
        service.addAccount(0, account1);
        assertEquals(1, service.repo.accountMap.size());
    }
	
	@Test
	public void testGetAccount()
	{
		service.addAccount(0,account1);
		assertEquals("Umayr", service.getAccount(0).getFirstName());
		
	}
	
	@Test
	public void testDeleteAccount()
	{
		service.addAccount(0, account1);
		
		service.deleteAccount(0);
		
		assertEquals(0, service.repo.accountMap.size());
	}
	
	@Test
	public void testSetFirstName()
	{
		account1.setFirstName("Nightmayr");
		assertEquals("Nightmayr", account1.getFirstName());
	}
	
	@Test
	public void testGetFirstName()
	{
		assertEquals("Umayr", account1.getFirstName());
	}
	
	@Test
	public void testSetLastName()
	{
		account1.setLastName("Umayr");
		assertEquals("Umayr", account1.getLastName());
	}
	
	@Test
	public void testGetLastName()
	{
		assertEquals("Nightmayr", account1.getLastName());
	}
	
	@Test
	public void testSetAccountNumber()
	{
		account1.setAccountNumber(1);
		assertEquals(1, account1.getAccountNumber());
	}
	
	@Test
	public void testGetAccountNumber()
	{
		assertEquals(0, account1.getAccountNumber());
	}
	
	@Test
	public void testToString()
	{
		service.addAccount(0,account1);
		assertEquals("Account [firstName=Umayr, lastName=Nightmayr, accountNumber=0]", service.getAccount(0).toString());
	}

}
