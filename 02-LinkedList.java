package dataStructures;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
	
		LinkedList<String> linkedList=new LinkedList<String>();

        //Pushing the elements in linkedList--So,It returns reverse as you stored

		/*linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("E");
		linkedList.push("F");
		*/
		
        //Opposite to the Past method 
		linkedList.offer("A");
		linkedList.offer("B");
		linkedList.offer("C");
		linkedList.offer("D");
		linkedList.offer("E");
		linkedList.offer("F");
		
		//linkedList.pop();
		//linkedList.poll();
		
        //Adding to & removing from the LinkList
		linkedList.add(4,"G");
		linkedList.remove("E");
		System.out.println(linkedList.indexOf("G"));
		
        //eturning the First and last Value in the LinkedList
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		
        //Adding at First And At the End
		linkedList.addFirst("0");
		linkedList.addLast("7");
		
        //Removing at First And At the End
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println(linkedList);
		
	}
}
