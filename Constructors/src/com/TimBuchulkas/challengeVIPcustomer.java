package com.TimBuchulkas;

public class challengeVIPcustomer {
	private String name;
	private double creditLimit;
	private String emailAddress;

	public challengeVIPcustomer() {

		this("Default name", 50000.00, "default@gmail.com");
	}

	public challengeVIPcustomer(String name, double creditLimit) {

		this(name,creditLimit,"unknown@gmail.com");
		
		//this.creditLimit = creditLimit;
	}

	public challengeVIPcustomer(String name, double creditLimit, String emailAddress) {

		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	

}
