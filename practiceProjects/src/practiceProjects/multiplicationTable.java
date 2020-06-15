package practiceProjects;

public class multiplicationTable {
	void print(){
		print(8);
		
	}
	
	void print(int table){
		print(table,1,10);
		
	}

	void print(int table,int From,int To){
		for(int i=From;i<=To;i++) {
			System.out.printf("%d x %d = %d ",table,i,table*i).println();
		}
	}

}
