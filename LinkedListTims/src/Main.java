import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer("Tim",54.96);
		Customer anotherCustomer;
		anotherCustomer=customer;
		anotherCustomer.setBalance(12.18);
		System.out.println("Balance for customer "+customer.getName()+" is "+customer.getBalance());
		
	    ArrayList<Integer> IntList=new ArrayList<Integer>();
	    IntList.add(1);
	    IntList.add(2);
	    IntList.add(3);
	    
	    IntList.add(1,2);
	    
	    for(int i=0;i<IntList.size();i++) {
	    	System.out.println(i+" :"+IntList.get(i));
	    }
	    for(int i=0;i<IntList.size();i++) {
	    	System.out.println(i+" :"+IntList.get(i));
	    }
	    
	}

}
