package dataStructures;

public class Main {
	public static void main(String[] args) {
		
		//Linear Search--It's Iterate through the Collection one Element At at time
		
		/*Runtime Complexity: O(n)
		 * 
		 * Cons:
		 * Slow For Larger Data sets
		 * 
		 * Advantages:
		 *   **Fast for Searches of small to Medium data Sets
		 *   **It doesn't need to be sorted
		 *   **Used in Linked List  */
		
		
		int[] array= {25,34,12,45,9,5,4};
		int index=linearSearch(array,5);
	
    //If the element is found
	if (index!=-1) {
		System.out.println("Element found at Index:"+index);
	}
    //It's Getting  activated when the element is not found 
	else {
		System.out.println("Element not found");
	}
	}
	
	private static int linearSearch(int[] array,int value) {
        
		for (int i=0;i<array.length;i++) {
			if(array[i]==value) {
				return i;
			}
		}
		return -1;
	}
}
