package functions.com;

import java.util.List;

public class FunctionalProgramRunner {

	public static void main(String[] args) {
	
		List<String> list=List.of("apple","bat","cat","dog");
		//printWithFP(list);
		//printBasic(list);
		//printBasicWithFiltering(list);
		printWithFPWithFiltering(list);

	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			System.out.println(string);
		}
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.parallelStream().forEach(element->System.out.println("element- " +element));
	}
	
	private static void printWithFPWithFiltering(List<String> list) {
		list.parallelStream()
		.filter(
				element->element.endsWith("at")
				).forEach
		(element->System.out.println("element- " +element));
	}

}
