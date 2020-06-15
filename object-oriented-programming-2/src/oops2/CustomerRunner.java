package oops2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress=new Address("line1","Bihar","803101");
		Customer customer=new Customer("Ritesh",homeAddress);

		Address workAddress=new Address("line1 for work","Bihar","713104");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
