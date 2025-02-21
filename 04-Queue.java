package dataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		//FIFO data structure.ie..,First In First Out(ex..Line Of People)
		//It's also Linear Data Structure
		/*
		 *1.add=enqueue,offer()
		 *2.remove=dequeue,poll()
		 */
		
		Queue<String> queue=new LinkedList<String>();
		
		//Offer is used to add the elements into the Queue
		queue.offer("Bikes");
		queue.offer("Cycle");
		queue.offer("Cars");
		queue.offer("Bus");
		queue.offer("Lorry");
		
		System.out.println("Before removal:-");
		System.out.println(queue);
		System.out.println();
		
		//Poll is used to remove the element in the Queue 
	
		queue.poll();
		queue.poll();
		queue.poll();
	
		System.out.println("After removal:-");
		System.out.println(queue);
		
		//It doesn't throw an exception when there is no element,but it throws when 
		//trying to access during no element
		
		/*queue.poll();
		queue.poll();
		
		queue.element();
		*/
		
		//To find Whether the Queue is Empty or Not
		System.out.println(queue.isEmpty());
		
		//To find the Size of  Queue 
		System.out.println(queue.size());
		
		//To find Given the given Value is Existed Or Not
		System.out.println(queue.contains("Lorry"));
	}
}
