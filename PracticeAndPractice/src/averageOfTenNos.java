import java.util.Scanner;

public class averageOfTenNos {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
	/*
		for(int i=0;i<=9;i++) {
			sum=sum+a[i];
			*/
		for(int value:a) {
			sum+=value;
		}
			System.out.println("average is " +sum);
		
	}

}
