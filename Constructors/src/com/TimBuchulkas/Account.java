package com.TimBuchulkas;

public class Account {
	private String accountNumber;
	private double balance;
	private String CustomerName;
	private String CustomerEmailAddress;
	private String CustomerPhoneNumber;
	
	public Account() {
		System.out.println("Empty customer called");
	}
	
	public Account(String number,double balance,String customerName, String CustomerEmailAddress,String CustomerPhoneNumber) {
		System.out.println();
		this.accountNumber=number;
		this.balance=balance;
		this.CustomerName=CustomerName;
		this.CustomerEmailAddress=CustomerEmailAddress;
		this.CustomerPhoneNumber=CustomerPhoneNumber;
	}
	
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
		System.out.println("Deposit of "+depositAmount +"made. New balance is "+this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(balance-withdrawalAmount<0) {
			System.out.println("Only " +this.balance +"available. Withdrawal not processed.");
		}else {
			this.balance-=withdrawalAmount;
			System.out.println("withdrawal of"+ withdrawalAmount +"processed. Remaining balance = "+balance);
		}
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerEmailAddress() {
		return CustomerEmailAddress;
	}
	public void setCustomerEmailAddress(String customerEmailAddress) {
		CustomerEmailAddress = customerEmailAddress;
	}
	public String getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		CustomerPhoneNumber = customerPhoneNumber;
	}
	
	
	

}
