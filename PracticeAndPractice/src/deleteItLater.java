import java.util.Scanner;

public class deleteItLater {

	public static void main(String[] args) {
		//Java program to reverse a number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number you want to reverse");
	    long number =scan.nextLong();
	    long rev=0;
	    while(number!=0) {
	    	rev=(long) (rev*10+number%10);
	    	number/=10;
	    	
	    }
	    System.out.println("reverse is: "+rev);

	}

}
