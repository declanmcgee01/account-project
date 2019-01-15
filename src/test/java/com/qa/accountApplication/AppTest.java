package com.qa.accountApplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	Service s;
	Account account1;
	Account account2;
	Account account3;
	
	@Before
	public void setUp()
	{
		s = new Service();
    	account1 = new Account("Umayr", "Nightmayr", 0);
    	account2 = new Account("Matt", "Trainerman", 1);
    	account3 = new Account("Jordan", "Totalbiscuit", 2);	
	}
	
	
	@Test
    public void testAddAccount()
    {
        s.addAccount(account1);
        assertEquals(1, s.accountMap.size());
    }
	
	@Test
	public void testGetAccount()
	{
		s.addAccount(account1);
		assertEquals("Umayr", s.getAccount(account1).getFirstName());
		
	}
	
	@Test
	public void testDeleteAccount()
	{
		s.addAccount(account1);
		s.deleteAccount(account1);
		assertEquals(0, s.accountMap.size());
	}

}
