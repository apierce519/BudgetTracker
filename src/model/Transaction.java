/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 4, 2021
 */
package model;

import java.time.LocalDate;

/**
 * @author Church519
 *
 */
public class Transaction {

	private final int DUEDATE = 15;
	private String transactionType;
	private LocalDate dueDate = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), DUEDATE);
	private LocalDate transactionDate;
	private double amount;
	private boolean transactionComplete;

	/**
	 * 
	 */
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(double amount, String type) {
		this.amount = amount;
		this.transactionType = type;
	}

	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	/**
	 * @return the dueDate
	 */
	public LocalDate getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the transactionDate
	 */
	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the transactionComplete
	 */
	public boolean isTransactionComplete() {
		return transactionComplete;
	}

	/**
	 * @param paidStatus the paidStatus to set
	 */
	public void setTransactionStatus(boolean status) {
		this.transactionComplete = status;
	}

	@Override
	public String toString() {
		return "Transaction [DUEDATE=" + DUEDATE + ", transactionType=" + transactionType + ", dueDate=" + dueDate
				+ ", transactionDate=" + transactionDate + ", amount=" + amount + ", transactionComplete="
				+ transactionComplete + "]";
	}

}
