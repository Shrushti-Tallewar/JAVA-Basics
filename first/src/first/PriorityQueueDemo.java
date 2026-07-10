package first;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main (String[]args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(50);
		pq.add(10);
		pq.add(30);
		pq.add(20);
		pq.add(40);
		System.out.println(pq);
		}
}
