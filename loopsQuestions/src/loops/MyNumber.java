package loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
   for(int i=2;i<=number-1;i++) {
	   if(number%i==0) {
		   return false;
	   }
   }
		return true;
	}

	public int sumUpToN() {
		int sum=0;
		for(int i=0;i<=number;i++) {
			sum+=i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		int sum=0;
		for(int i=2;i<=number-1;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
		return sum;
	}

}
