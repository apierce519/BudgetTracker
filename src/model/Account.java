/**
 * @author Andrew Pierce - ajpierce1
 * CIS175 - Fall 2021
 * Sep 4, 2021
 */
package model;

/**
 * @author Church519
 *
 */
public class Account {

	private String accountName;
	private String accountType;
	private double balance;
	private boolean overdrawn;

	/**
	 * 
	 */
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public Account(double balance, String accName) {
		this.balance = balance;
		this.accountName = accName;
	}

	public Account(double balance, String accName, String accType) {
		this.balance = balance;
		this.accountName = accName;
		this.accountType = accType;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	/**
	 * @return the overdrawn
	 */
	public boolean isOverdrawn() {
		return overdrawn;
	}

	/**
	 * @param overdrawn the overdrawn to set
	 */
	public void setOverdrawn(boolean overdrawn) {
		this.overdrawn = overdrawn;
	}

	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountType=" + accountType + ", balance=" + balance + "]";
	}

	
	

}
