import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		
		System.out.println("enter second number");
		int b=scan.nextInt();
		
		int c=a+b;
		System.out.println("sum of both numbers is: " +c);
	}
	
}
