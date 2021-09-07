/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 4, 2021
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Account;
import model.Transaction;
import model.BusinessLogic;

/**
 * @author Church519
 *
 */
public class TestAccountLogic {
	
	Account checkingAccount = new Account(0);
	Transaction paycheck = new Transaction(500,"income");
	BusinessLogic accBL = new BusinessLogic();
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	
	}

	@Test
	public void testDepositMethod() {
		
		accBL.makeDeposit(paycheck,checkingAccount);
		assertEquals(500, checkingAccount.getBalance(),0);				
	}
	
	@Test
	public void testWithdrawMethod() {
		checkingAccount.setBalance(500);
		accBL.makeWithdrawal(100,checkingAccount);
		assertEquals(400, checkingAccount.getBalance(),0);
	}
	
	@Test
	public void testOverdrawn() {
		checkingAccount.setBalance(-50);
		assertTrue(accBL.isAccOverdrawn(checkingAccount));
		
	}

}
