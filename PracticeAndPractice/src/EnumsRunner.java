import java.util.EnumSet;

public class EnumsRunner {

	public static void main(String[] args) {
		for(Enums people:Enums.values()) 
			System.out.printf("%s\t%s\t%s\n",people,people.getBio(),people.getYear());
		
            System.out.println("\n And now for the range of constants\n");
	
       for(Enums people: EnumSet.range(Enums.Aarav,Enums.Ram))
    	   System.out.printf("%s\t%s\t%s\n",people,people.getBio(),people.getYear());
}
   }

