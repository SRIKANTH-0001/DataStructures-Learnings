package dataStructures;

public class QuickSort {

	public static void main(String[] args) {
	
		int[] array= {2,4,1,3,6};
		quicksort(array,0,array.length-1);
		
		for(int i:array) {
			System.out.println(i + " ");	
		}
	}

	public static void quicksort(int[] array, int start, int end) {
		
		if(end<=start) return;
		
		int pivot=partition(array,start,end);
		
		quicksort(array,start,pivot-1);
		quicksort(array,pivot+1,end);
	}

	private static int partition(int[] array, int start, int end) {
		int pivot=array[end];
		int i=start-1;
		
		for(int j=start;j<=end-1;j++) {
			if(array[j]<pivot) {
				i++;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		i++;
		int temp=array[i];
		array[i]=array[end];
		array[end]=temp;
	
		return i;
	}
}