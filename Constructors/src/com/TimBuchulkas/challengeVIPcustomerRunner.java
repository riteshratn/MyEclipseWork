package com.TimBuchulkas;

public class challengeVIPcustomerRunner {

	public static void main(String[] args) {
		challengeVIPcustomer p1=new challengeVIPcustomer();
		System.out.println(p1.getName());
		
		challengeVIPcustomer p2=new challengeVIPcustomer("Bob",25000.00);
		System.out.println(p2.getName());
		
		challengeVIPcustomer p3=new challengeVIPcustomer("Ray",100.00,"ray@gmail.com");
		System.out.println(p3.getName());
		System.out.println(p3.getEmailAddress());
		System.out.println(p3.getCreditLimit());


	}

}
