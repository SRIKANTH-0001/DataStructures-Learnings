package dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		//Priority Queue--it's a FIFO dataStucture that serves the elements 
		//--with the heighest priority first before elements with Lowest Priority
		
		//With the following normal Queue we can get the element in FIFO order 
		//Queue<Integer> queue=new LinkedList<Integer>();
		
		//But,with Priority Queue It's gonna display based on priority
		//Queue<Integer> queue=new PriorityQueue<Integer>();
		
		//If you want the elements with in Reverse order
		Queue<String> queue=new PriorityQueue<String>(Collections.reverseOrder());
		
		
		//Inserting the elements in the Queue
		
		/*queue.offer(4);
		queue.offer(3);
		queue.offer(1);
		queue.offer(5);
		queue.offer(2);
		*/
		
		queue.offer("B");
		queue.offer("D");
		queue.offer("A");
		queue.offer("C");
		queue.offer("E");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
