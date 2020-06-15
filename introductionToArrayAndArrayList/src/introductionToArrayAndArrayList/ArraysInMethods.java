package introductionToArrayAndArrayList;

public class ArraysInMethods {

	public static void main(String[] args) {
		int arr[]= {3,4,5,6,7};
		change(arr);
		for(int y:arr)
			System.out.println(y);
		
	}
      public static void change(int x[]) {
    	  for(int i=0;i<x.length;i++)
    		  x[i]+=5;
      }
}
