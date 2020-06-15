package loopsQuestions;

import java.util.Scanner;

public class averageCalculator {

	public static void main(String[] args) {
		System.out.printf("Enter 10 numbers");
		Scanner input=new Scanner(System.in);
		int total=0,marks,counter=0;
		double average;
	
		while(counter<10) {
			marks=input.nextInt();
			total=total+marks;
			counter++;
		}
		average=total/10.0;
		System.out.println("Your average is"+ average);
		

	}

}
