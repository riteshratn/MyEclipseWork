import java.util.Scanner;
import java.util.*;

      // *
      // **
      // ***
      // ****
      // *****

/*public class pattern1 {

	public static void main(String[] args) {
		
//		for(int i=0;i<=5;i++) {
//			for(int j=0;j<=5;j++) {
//				if(j<i) {
//					System.out.printf("*");
//				}else {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println(" ");
//		}
		
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print(" * ");
                }
                else{
                    System.out.printf(" ");
                }
                
            }
            System.out.println();
        }
	
	}

}*/
//class pattern1{
//	public static void main(String [] args) {
//		Scanner sc = new Scanner(System.in);
//		int testcase=sc.nextInt();
//		while(testcase-->0) {
//			int n=sc.nextInt();
//			int m=sc.nextInt();
//			int arr[] = new int[n];
//			for(int i=0;i<n;i++) {
//				arr[i]=sc.nextInt();
//			}
//			int sum=0;
//			for(int i=0;i<n;i++) {
//				sum+=arr[i];
//			}
//			int r=sum/m;
//			int ans=sum-r*m;
//			for(int j=1;j<=n;j++) {
//			System.out.println("Case #" + i + ": " + ans);
//			//break;
//			}
//		}
//		
//	}
//}





//public class pattern1 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
//        for (int i = 1; i <= t; ++i) {
//            int n = in.nextInt();
//            int m = in.nextInt();
//            int candies = 0;
//
//            for(int j = 1; j <= n; j++) {
//                candies += in.nextInt();
//            }
//
//            int leftCandies = candies % m;
//            
//            System.out.println("Case #" + i + ": " + leftCandies);
//        }
//    }
//}


public class pattern1{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int T = in.nextInt();
    for (int t = 0; t < T; t++) {
        int l = in.nextInt();
        int r = in.nextInt();
        long n = Math.min(l, r);
        long re = (n + 1) * n / 2;
        System.out.println("Case #" + (t + 1) + ": " + re);
    }
}
}