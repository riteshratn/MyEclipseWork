package loopsQuestions;

import loops.MyNumber;

public class MyNumberRunner {

	public static void main(String[] args) {
	MyNumber number=new MyNumber(6);
	boolean isPrime=number.isPrime();
	System.out.println("isPrime " +isPrime);
	
	int sum=number.sumUpToN();
	System.out.println("sumUpToN " +sum);
	
	int sumOfDivisors=number.sumOfDivisors();
	System.out.println("sumOfDivisors "+sumOfDivisors);
	}

}
