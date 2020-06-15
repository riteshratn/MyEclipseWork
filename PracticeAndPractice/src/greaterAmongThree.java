

public class greaterAmongThree {
	//UsingRecursion

	public static void main(String[] args) {
	System.out.println(greatest(10,62,4));

	}
   public static int greatest(int a,int b,int c) {
	  if(a>b&&a>c) {
		  return a;
	  }else {
		  if(b>c) {
			  return b;
		  }else {
			  return c;
		  }
	  }
	
   }
}
