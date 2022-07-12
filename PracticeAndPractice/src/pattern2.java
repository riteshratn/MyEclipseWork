      // 1
      // 12
      // 123
      // 1234
      // 12345

public class pattern2 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			int k=1;
			for(int j=0;j<=5;j++) {
				if(j<i) {
					System.out.printf("%d", k++);
					
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println(" ");
		}
	
	}

}
