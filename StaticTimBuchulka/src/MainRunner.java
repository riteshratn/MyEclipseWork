
public class MainRunner {
	public static int multiplier=7;

	public static void main(String[] args) {
//		StaticTest firstInstances=new StaticTest("1st instances");
//		System.out.println(firstInstances.getName()+ " is instance number" +StaticTest.getNumInstances());
//		
//		StaticTest secondInstance=new StaticTest("2nd instance");
//		System.out.println(secondInstance.getName()+ " is instance number" +StaticTest.getNumInstances());
//		
//		StaticTest thirdInstance=new StaticTest("3rd instance");
//		System.out.println(thirdInstance.getName()+ " is instance number" +StaticTest.getNumInstances());
		
		int answer=multiply(6);
		System.out.println("answer is "+answer);
		System.out.println("multiplier is "+multiplier);

		
		public static int multiply(int number) {
			return number*multiplier;
		}
	}
}
