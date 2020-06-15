import java.util.HashSet;
import java.util.Iterator;

public class Hashsett {

	public static void main(String[] args) {
		/*
		HashSet<String> h=new HashSet<String>();
		h.add("enemy");
		h.add("strawberry");
		h.add("spider monkey");
		h.add("dog");
		h.add("gorilla");
		
		//System.out.println(h.size());
		//System.out.println(h.contains("dog"));
		
		System.out.println(h);
      */
		
		
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(12);
		h.add(23);
		h.add(32);
		h.add(7);
		h.add(35);
		
	Iterator<Integer> it=h.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
		
	}

}
