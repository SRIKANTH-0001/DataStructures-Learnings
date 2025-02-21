package dataStructures;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
	
		Stack<String> stack=new Stack<String>();
		//Stack data structure provides five unique methods,such as
		//Stack is LIFO data structure
		/*1.push()-To add an element at the Top
		 *2.pop()-To remove an element at the Top
		 *3.peek()-To return the top of the stack
		 *4.empty()-To check whether the Stack is empty or not?
		 *5.search()-Search an element by passing the "element or value"
		 */
		
		stack.push("Vice City");
		stack.push("Call of Duty");
		stack.push("Free Fire");
		stack.push("League of Legends");
		stack.push("Fortnite Battle Royale");
	
	//System.out.println("Stack is Empty Or Not: "+stack.empty());
	//System.out.println(stack);
	
	System.out.println("The element Existed at Top of Stack Before Deletion: "+stack.peek());
	
	String delGame=stack.pop();
	System.out.println("The element Removed at Top of Stack: "+delGame);
	
	System.out.println(stack);
	System.out.println("The Current element Existed at Top of Stack: "+stack.peek());
	
	//During the searching ,It takes Index from bottom to top Becuz of Stack
	System.out.println("The index of given Object: "+stack.search("Free Fire"));
	
	}
}
