
import java.util.Scanner;

public class EvenAndOddCount {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int EvenCount=0;
		int OddCount=0;
		while(num>0) {
			int rem=num%10;
			if(rem%2==0) {
				EvenCount++;
			}else {
				OddCount++;
			}
			num=num/10;  //ToEliminateLastDigit
		}
          System.out.println("Number Of Even Digits:" +EvenCount);
          System.out.println("Number Of odd Digits:" +OddCount);
	}

}
