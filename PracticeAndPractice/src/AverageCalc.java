import java.util.Scanner;

public class AverageCalc {

	public static void main(String[] args) {
		System.out.printf("Enter 10 numbers");
       Scanner input=new Scanner(System.in);
       int sum=0,counter=0,marks;
       double average;
       while(counter<10) {
    	   marks=input.nextInt();
    	   sum=sum+marks;
    	   counter++;
       }
       average=sum/10.0;
       System.out.println("Your average is" + average);
       
	}

}
