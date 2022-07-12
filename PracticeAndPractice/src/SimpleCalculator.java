
public class SimpleCalculator {
	public double Addition;
	public double Subtraction;
	public double Multiplication;
	public double Division;
	
	public double getAddition() {
		return Addition;
	}
	public void setAddition(double addition) {
		Addition = addition;
	}
	public double getSubtraction() {
		return Subtraction;
	}
	public void setSubtraction(double subtraction) {
		Subtraction = subtraction;
	}
	public double getMultiplication() {
		return Multiplication;
	}
	public void setMultiplication(double multiplication) {
		Multiplication = multiplication;
	}
	public double getDivision() {
		return Division;
	}
	public void setDivision(double division) {
		Division = division;
	}
	 public static int Addition(int a,int b) {
		 return a+b;
	 }
	public int Subtraction(int i, int j) {
		
		return i-j;
	}
	public int Multiplication(int i, int j) {
		
		return i*j;
	}
	public double Division(int i, int j) {
		
		return i/j;
	}


}
