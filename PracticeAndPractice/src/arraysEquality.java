import java.util.Arrays;

public class arraysEquality {

	public static void main(String[] args) {
		
		int a1[]= {3,4,5,6,7,8};
		int a2[]= {3,4,5,6,7,8};
		
		boolean status=Arrays.equals(a1, a2);
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
		
		
	}

}
