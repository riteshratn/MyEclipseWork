import java.util.Scanner;

public class HelloNameRunner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		HelloName helloNameObject=new HelloName();
		System.out.println("Enter your name");
		String name=input.nextLine();
		
		helloNameObject.simpleMessage(name);
	}

}
