package loops;

public class numberTriangle {

	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=1;j<=5;j++) {
				if(j<=i) 
					System.out.printf("%d ",k++);
				else 
					System.out.printf(" ");
				
			}
			System.out.printf(" ").println();
			
		}
	}
}
