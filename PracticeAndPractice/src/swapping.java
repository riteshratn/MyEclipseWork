import java.util.Scanner;

public class swapping {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int a=scan.nextInt();
		
		System.out.println("enter second number");
		int b=scan.nextInt();
		
		int c=a;
		a=b;
		b=c;
		System.out.printf("numbers after swapping:"+a);
		System.out.printf("numbers after swapping:"+b);
	}

}
