package com.inRiteshOfficial;

import java.util.Scanner;

public class SwitchCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		System.out.println("What mathematical operation do you want");
		System.out.println(" 1-subtraction\n 2-multiplication\n 3-addition\n 4-division");
		System.out.println("enter your choice");
		choice = scan.nextInt();
		switch (choice) {

		case 1:
			System.out.println("enter first number"); // subtraction
			int A = scan.nextInt();

			System.out.println("enter second number");
			int B = scan.nextInt();

			int C = A - B;
			System.out.println("subtraction of both numbers is: " + C);
			break;
		case 2:
			System.out.println("enter first number"); // multiplication
			int e = scan.nextInt();

			System.out.println("enter second number");
			int f = scan.nextInt();

			int d = e * f;
			System.out.println("multiplication of both numbers is: " + d);
			break;
		case 3:
			System.out.println("enter first number"); // addition
			int a = scan.nextInt();

			System.out.println("enter second number");
			int b = scan.nextInt();

			int c = a + b;
			System.out.println("sum of both numbers is: " + c);
			break;
		case 4:
			System.out.println("enter first number"); // division
			int E = scan.nextInt();

			System.out.println("enter second number");
			int F = scan.nextInt();

			double D = E / F;
			System.out.println("division of both numbers is: " + D);
			break;
		default:
			System.out.println("Invalid Choice!!!");
			break;
		}
	}

}
