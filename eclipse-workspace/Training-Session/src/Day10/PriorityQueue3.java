package Day10;

import java.util.PriorityQueue;

public class PriorityQueue3 {
	public static void main(String args[]) {
		PriorityQueue pq=new PriorityQueue();
		
		/*pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
		*/
		System.out.println(pq);
		System.out.println(pq.poll());//returns null if does not found any element
	}
}