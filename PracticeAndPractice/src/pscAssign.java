
public class pscAssign {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();

	}

}

 final class A{
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{
	public void show() {
		System.out.println("In B show");
	}
}











//
//
//class pscAssign {
//	  public static void main(String[] args) {
//
//	    // create a final variable
//	    final int AGE = 32;
//
//	    // try to change the final variable
//	    AGE = 45;
//	    System.out.println("Age: " + AGE);
//	  }
//	}
//
























