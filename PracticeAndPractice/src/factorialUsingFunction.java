import java.util.Scanner;

public class factorialUsingFunction {
	
	public static void factorial(int n)
	{
		
		if(n<0) {
			System.out.println("Facotorial can't be found for negative numbers.");
			return;
		}
		
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate factorial: ");
		int n=sc.nextInt();
		factorial(n);

	}

}
