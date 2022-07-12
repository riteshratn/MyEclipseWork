import java.util.*;
public class dsePrac {

	public static void main(String[] args) {
		 
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(4);
		ll.add(9);
		ll.add(3);
		ll.add(2);
		printLinked(ll);
	}
	public static void printLinked(LinkedList<Integer> ll) {
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
	}

}
