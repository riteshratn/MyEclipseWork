package tips.imports;

public class enhancedForLoop {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,7,8};
		int sum=0;
		for(int x:arr) {
			sum+=x;
		}
System.out.println(sum);
	}

}
