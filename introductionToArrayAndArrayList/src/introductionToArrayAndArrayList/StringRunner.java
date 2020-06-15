package introductionToArrayAndArrayList;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		String dayWithMostCharacter=" ";
		for(String day:daysOfWeek) {
			if(day.length()>dayWithMostCharacter.length()) {
				dayWithMostCharacter=day;
			}
			
		}
		System.out.println("Day with most character " +dayWithMostCharacter);
		
		for(int i=daysOfWeek.length-1;i>=0;i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
