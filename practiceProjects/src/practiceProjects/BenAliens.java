package practiceProjects;

import java.util.Scanner;

public class BenAliens {
	
//  Taking User Input From String
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the names");
		
		System.out.println("Enter alien1");
		String alien1=scan.nextLine();
		
		System.out.println("Enter alien2");
		String alien2=scan.nextLine();
		
		System.out.println("Enter alien3");
		String alien3=scan.nextLine();
		
		System.out.println("Enter alien4");
		String alien4=scan.nextLine();
		
		System.out.println("Enter alien5");
		String alien5=scan.nextLine();
		
		System.out.println("Names You Entered:");
		
		System.out.println(alien1);
		System.out.println(alien2);
		System.out.println(alien3);
		System.out.println(alien4);
		System.out.println(alien5);
	}

}
