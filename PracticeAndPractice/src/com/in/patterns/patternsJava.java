package com.in.patterns;

import java.util.Scanner;

public class patternsJava {

	public static void main(String[] args) {
		
		
//PATTERN-1		
//		for(int i=0;i<=3;i++)
//		{
//			for(int j=0;j<=4;j++) {
//				System.out.printf("* ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=4;i++)
//			{
//				for(int j=1;j<=5;j++) {
//					if(i==1||i==4||j==1||j==5) {
//						System.out.printf("*");
//					}else {
//						System.out.print(" ");
//					}
//					
//				}
//				System.out.println();
//			}
		
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++) {
//				if(j<=i) {
//					System.out.printf("* ");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++) {
//				if(j<=5-i) {
//					System.out.printf("* ");
//				}else {
//					System.out.printf(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++) {
				if(j>=5-i) {
					System.out.printf("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			int number=1;
//			for(int j=1;j<=n;j++) {
//				if(j<=i) {
//					System.out.printf(number +" ");
//					number++;
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//		{
//			int number=1;
//			for(int j=1;j<=n;j++) {
//				if(j<=n+1-i) {
//					System.out.printf(number +" ");
//					number++;
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		//FLOYD'S TRIANGLE
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		int k=1;
//		for(int i=1;i<=n;i++)
//			{
//				for(int j=1;j<=n;j++) {
//					if(j<=i) {
//						System.out.printf(k+" ");
//						k++;
//					}else {
//						System.out.print(" ");
//					}
//					
//				}
//				System.out.println();
//			}
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++)
//			{
//				for(int j=1;j<=i;j++) {
//					if(((j+i)%2==0)) {
//						System.out.printf("1 ");
//					}else {
//						System.out.print("0 ");
//					}
//					
//				}
//				System.out.println();
//			}
		
		

//		for(int i=1;i<=5;i++)
//			{
//				for(int j=1;j<=9;j++) {
//					if(j>=6-i&&j<=10-i) {
//						System.out.printf("* ");
//					}else {
//						System.out.print(" ");
//					}
//					
//				}
//				System.out.println();
//			}
		
		
//		int k;
//		for(int i=1;i<=5;i++)
//		{
//			k=i;
//			for(int j=1;j<=9;j++) {
//				if(j>=6-i&&j<=4+i) {
//					System.out.print(k);
//					//j<5?k++:k--;
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
//		Scanner sc = new Scanner(System.in);
//	      int row=sc.nextInt();
//	      int col=sc.nextInt();
//	      
//	      int [][] number = new int[row][col];
//	      
//	      for(int i=0;i<row;i++) {
//	    	  for(int j=0;j<col;j++) {
//	    		  number[i][j]=sc.nextInt();
//	    	  }
//	      }
//	      
//	      for(int i=0;i<row;i++) {
//	    	  for(int j=0;j<col;j++) {
//	    		  System.out.print(number[i][j]);
//	    	  }
//	    	  System.out.println();
//	      }
		
		
		Scanner sc = new Scanner(System.in);
		 int w = sc.nextInt();
		 if(w%2==0){
		     System.out.println("YES");
		 }else{
		     System.out.println("NO");
		 }
		
      
		
	}

}
