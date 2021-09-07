/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 5, 2021
 */
package tests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import model.Account;
import model.BusinessLogic;
import model.Transaction;

/**
 * @author Church519
 *
 */
public class TestTransactionLogic {

	LocalDate date = LocalDate.now();
	Account checkingAccount = new Account(0);
	Transaction paycheck = new Transaction(500, "Income");
	Transaction utilBill = new Transaction(50, "Bill");
	BusinessLogic accBL = new BusinessLogic();
	String paid = "Paid on: " + date;
	String notPaid = "Has not been paid.";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testOverdue() {
		LocalDate newDueDate = LocalDate.of(2021, 9, 1);
		utilBill.setDueDate(newDueDate);
		assertTrue(accBL.isLate(utilBill));
		assertFalse(accBL.isLate(paycheck));
	}

	@Test
	public void testmakePayment() {
		accBL.makeDeposit(paycheck, checkingAccount);
		accBL.makePayment(utilBill, checkingAccount);
		assertEquals(450.00, checkingAccount.getBalance(), 0);
		assertEquals(paid, accBL.paymentStatus(utilBill));
		assertEquals(paid, accBL.paymentStatus(paycheck));
	}
}
