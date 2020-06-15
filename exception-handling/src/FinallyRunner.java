import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		
		Scanner scanner=null;
		
		try {
		scanner=new Scanner(System.in);
		
		int[] numbers= {12,3,4,5};
		int number=numbers[2];
		
		
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(" Before Scanner Close");
			if(scanner!=null) {
			scanner.close();
			}
		}
		System.out.println(" Just Before Closing Out Main");
	}

}
