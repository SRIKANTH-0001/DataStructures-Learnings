package dataStructures;

public class SelectionSort {

	public static void main(String[] args) {
	
		int[] array= {6,7,5,2};
		SelectionSort(array);
		
		for(int f:array) {
			System.out.println("Sorted array:"+f);	
		}
	}
		
	private static void SelectionSort(int[] array) {
		// Start traversing from 0th index to final element 
		for(int i=0;i<array.length-1;i++) {
			//considering the first value as min_val
			int min=i;
			for(int j=i+1;j<array.length;j++) {
				if(array[min]>array[j]) {
					min=j;
				}
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
}