import java.util.Scanner;

public class challenge4 {
         // Min. and Max. Challenge
	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   
	   int min=Integer.MAX_VALUE;
	   int max=Integer.MIN_VALUE;
	   
//	   int min=0;
//	   int max=0; 
//	   boolean first=true;
	   
	   while(true) {
		   System.out.println("Enter number:");
		   boolean isAnInt = scan.hasNextInt();
		   if(isAnInt) {
			   int number=scan.nextInt();
//			   if(first) {
//				   first=false;
//				   min=number;
//				   max=number;
//			   }
			   if(number>max) {
				   max=number;
			   }
			   
			   if(number<min) {
				   min=number;
			   }
			   
		   }else {
			   break;
		   }
		   scan.nextLine();
	   }
	   System.out.printf("min = "+min +" max = " +max);
	   scan.close();

	}

}
