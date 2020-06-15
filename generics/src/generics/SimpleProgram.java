package generics;

import java.util.ArrayList;

public class SimpleProgram {

	public static void main(String[] args) {
		ArrayList<Integer> items=new ArrayList<Integer>();
		items.add(1);
		items.add(2);
		items.add(3);
		//items.add("Tim");
		items.add(4);
		items.add(5);
		
		printDoubled(items);
		
	}

	private static void printDoubled(ArrayList<Integer> items) {
		for(int i : items) {
			System.out.println((Integer) i*2);
		}
		
	}
}
