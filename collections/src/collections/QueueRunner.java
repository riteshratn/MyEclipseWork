package collections;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueRunner {

	public static void main(String[] args) {
	Queue<String> queue=new PriorityQueue<>();
	queue.addAll(List.of("Zebra","Monkey","Cat"));
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	System.out.println(queue.poll());
	
	}

}
