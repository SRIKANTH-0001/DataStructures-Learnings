package dataStructures;

public class Bubblesort {

	public static void main(String[] args) {
	
		int[] array= {1,5,3,9,6,8,2};
		BubbleSort(array);
		
		for(int f:array) {
			System.out.println("Sorted array:"+array[f]);	
		}
	}
	
	public static void BubbleSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
	}
	}
}
