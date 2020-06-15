package com.inRiteshOfficial;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		//method 1
		try {
			int[] a= {3,4,5};
			System.out.println(a[4]);
		}catch(Exception e) {
			System.out.println("index was out of bound");
		}
		
		//method 2
		Scanner sc=new Scanner(System.in);
		System.out.println("whats ur fav number");
		try {
			int n=sc.nextInt();
			System.out.println("your fav no. is= " +n);
		}catch(Exception e) {
			System.out.println("sorry! you did not enter a number");
		}
		
		//method 3
		try {
			int[] a= null;
			System.out.println(a[1]);
		}catch(NullPointerException e) {
			System.out.println("your array is null");
		}
		
		//method 4
				try {
					int[] a= {2};
					System.out.println(a[1]);
				}catch(NullPointerException e) {
					System.out.println("your array is null");
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("your Index is Out Of Bounds");
				}catch(Exception e) {
					System.out.println("Something else went wrong");
				}
		
	}

}
