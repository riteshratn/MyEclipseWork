package RKfunctionalProgramming;

import java.util.List;
import java.util.stream.IntStream;
//exercises using functional programming
public class exercises {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(4,6,8,13,3,15);
		//1- print squares of first ten numbers
		IntStream.range(1,11).map(e->e*e).forEach(p->System.out.println(p));
		
		
		//2- List.of("apple","bat","cat").stream()
		//map these to lower case
		List.of("Apple","Bat","Cat").stream().map(s->s.toLowerCase()).forEach(p->System.out.println(p));
		
		
		//3- List.of("apple","bat","cat").stream()
		//print length of each stream
		List.of("Apple","Bat","Cat").stream().map(s->s.length()).forEach(p->System.out.println(p));
		
		//4- odd no. among 5
		List.of(23,12,24,31,56).stream().filter(e->e%2==1).forEach(p->System.out.println(p));
		
		//even no.among 5
		List.of(23,12,24,31,56).stream().filter(e->e%2==0).forEach(p->System.out.println(p));
	}

}
