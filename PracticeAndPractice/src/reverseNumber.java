import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number you want to reverse");
		long num=scan.nextLong();
		long rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
	}
		System.out.println("reverse is: " +rev);
   }
 }
