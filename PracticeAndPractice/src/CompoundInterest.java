
public class CompoundInterest {

	public static void main(String[] args) {
		double amount;
		double principal=10000,rate=.01;
		for(int day=1;day<=20;day++) {
			amount=principal*Math.pow(1+rate, day);
			System.out.println(day+"  "+ amount);
		}

	}

}
