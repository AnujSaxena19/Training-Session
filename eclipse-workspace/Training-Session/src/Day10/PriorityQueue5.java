package Day10;

import java.util.PriorityQueue;

public class PriorityQueue5 {
	public static void main(String args[]) {
		PriorityQueue pq=new PriorityQueue();
		
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
		
		System.out.println(pq);
		System.out.println(pq.peek());//returns first element of the queue generally but if queue is empty it returns null
		System.out.println(pq);
	}
}