import java.util.*;
public class lapindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   int testcase=sc.nextInt();
		   while(testcase-->0){
		       String str=sc.next();
		       int l=str.length();
		       if(l%2==0){
		           String lp=str.substring(0,l/2);
		           String rp=str.substring(l/2);
		           char[] first = lp.toCharArray();
	               char[] second = rp.toCharArray();
	               Arrays.sort(first);
	               Arrays.sort(second);
	               if(first.equals(second)){
	                   System.out.println("YES");
	               }else{
	                   System.out.println("NO");
	               }
		       }
		       if(l%2==1){
		           String ls=str.substring(0,(l/2));
		           String rs=str.substring((l/2)+1);
		           char[] s1 = ls.toCharArray();
	               char[] s2 = rs.toCharArray();
	               Arrays.sort(s1);
	               Arrays.sort(s2);
	               if(s1.equals(s2)){
	                   System.out.println("YES");
	               }else{
	                   System.out.println("NO");
	               }
		       }
		   }

	}

}

