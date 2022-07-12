import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter second number");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("sum of both number is: "+c);
	}
	
}
