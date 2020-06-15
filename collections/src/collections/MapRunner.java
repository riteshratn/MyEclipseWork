package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion." + "This has never happened before.";
		Map<Character, Integer> occurances = new HashMap();
		char[] characters = str.toCharArray();
		for (char character : characters) {
			// Get The Characters
			Integer integer = occurances.get(character);
			if (integer == null) {
				occurances.put(character, 1);
			} else {
				occurances.put(character, integer + 1);
			}

		}
		System.out.println(occurances);

		Map<String, Integer> StringOccurances = new HashMap();
		String[] words = str.split(" ");

		for (String word : words) {
			// Get The Characters
			Integer integer = StringOccurances.get(word);
			if (integer == null) {
				StringOccurances.put(word, 1);
			} else {
				StringOccurances.put(word, integer + 1);
			}

		}
		System.out.println(StringOccurances);
		
			}

}
