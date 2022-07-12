import java.util.Scanner;

public class SumOfDigitsInANumber {

	public static void main(String[] args) {
	   System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
      System.out.println("Sum of Digits:" +sum);
	}

}
