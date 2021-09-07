/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 5, 2021
 */
package model;

import java.time.LocalDate;

/**
 * @author Church519
 *
 */
public class BusinessLogic {

	/**
	 * 
	 */
	public BusinessLogic() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLate(Transaction in) {
		return in.getDueDate().isBefore(LocalDate.now());
	}

	public String paymentStatus(Transaction in) {
		if (!in.isTransactionComplete()) {
			System.out.println(in.isTransactionComplete());
			return "Has not been paid.";

		} else {
			System.out.println(in.isTransactionComplete());
			return "Paid on: " + in.getTransactionDate();
		}
	}

	public void makePayment(Transaction in, Account acc) {
		acc.setBalance(acc.getBalance() - in.getAmount());
		in.setTransactionDate(LocalDate.now());
		in.setTransactionStatus(true);
	}

	public void makeDeposit(Transaction in, Account acc) {
		acc.setBalance(acc.getBalance() + in.getAmount());
		in.setTransactionDate(LocalDate.now());
		in.setTransactionStatus(true);

	}

	public void makeWithdrawal(double amt, Account acc) {
		acc.setBalance(acc.getBalance() - amt);
		if (acc.getBalance() < 0) {
			acc.setOverdrawn(true);
		}
	}

	public boolean isAccOverdrawn(Account acc) {
		if(acc.getBalance() < 0) {
			acc.setOverdrawn(true);
		}
		return acc.isOverdrawn();

	}
}
