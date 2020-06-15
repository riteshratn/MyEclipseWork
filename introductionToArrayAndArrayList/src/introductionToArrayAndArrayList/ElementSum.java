package introductionToArrayAndArrayList;

public class ElementSum {

	public static void main(String[] args) {
		
		int arr[]= {21,16,86,21,20};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		
		}
		
		System.out.println("Sum of elements of array is " + sum);
	}

}
