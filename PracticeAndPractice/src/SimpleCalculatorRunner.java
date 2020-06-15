import com.inRiteshOfficial.blank;

public class SimpleCalculatorRunner {

	public static void main(String[] args) {
		
		SimpleCalculator calculate=new SimpleCalculator();
	    System.out.println("Addition is = "+calculate.Addition(24,26));
	    System.out.println("Subtraction is = "+calculate.Subtraction(20,10));
	    System.out.println("Multiplication is = "+calculate.Multiplication(21,3));
	    System.out.println("Division is = "+calculate.Division(21,3));
		
	}
}