package com.TimBuchulkas;

public class AccountRunner {

	public static void main(String[] args) {
		Account bobs=new Account("12345",0.00,"Bob Brown","bob123@gmail.com","123-456-7890");
		
	
//		bobs.setAccountNumber("12345");
//		bobs.setBalance(0.00);
//		bobs.setCustomerEmailAddress("bob123@gmail.com");
//		bobs.setCustomerName("Bob Brown");
//		bobs.setCustomerPhoneNumber("123-456-7890");
		
		bobs.withdrawal(100.0);
		
		bobs.deposit(50.0);
		bobs.withdrawal(100.0);
		
		bobs.deposit(51.0);
		bobs.withdrawal(100.0);
		
		System.out.println(bobs.getAccountNumber());
		System.out.println(bobs.getBalance());
		System.out.println(bobs.getCustomerName());
		System.out.println(bobs.getCustomerEmailAddress());
		System.out.println(bobs.getCustomerPhoneNumber());
		

	}

}
