package dataStructures;

public class InsertionSort {

	public static void main(String[] args) {
	
		int[] array= {5,3,1,6};
		Insertionsort(array);
		
		for(int f:array) {
			System.out.println("Sorted array:"+f);	
		}
	}
		
	private static void Insertionsort(int[] array) {
		// Start traversing from 0th index to final element 
		for(int i=1;i<array.length;i++) {
			int temp=array[i];
			int j=i-1;
			//To avoid the arrayIndexOutofBound Exception j>=0
			while(j>=0 && array[j]>temp) {
				array[j+1]=array[j] ;
				j--;
			}
			array[j+1]=temp;
		}
	}
}