package dataStructures;

public class MergeSort {

	public static void main(String[] args) {
	
		int[] array= {5,3,1,6};
		Mergesort(array);
		
		for(int f:array) {
			System.out.println("Sorted array:"+f);	
		}
	}
	
	private static void Mergesort(int[] array) { 
		int length=array.length;
		if(length<=1) return;
		
		int middle=length/2;
		int leftarray[]=new int[middle];
		int rightarray[]=new int[length-middle];
		
		int i=0;
		int j=0;
		
		for(;i<length-1;i++) {
			if(i<middle) {
				leftarray[i]=array[i];
			}
			else{
				rightarray[j]=array[i];
			    j++;
			}
		}
		Mergesort(leftarray);
		Mergesort(rightarray);
		merge(leftarray,rightarray,array);
	}

	private static void merge(int[] leftarray, int[] rightarray, int[] array) {
		int leftsize=array.length/2;
		int rightsize=array.length-leftsize;
		int i=0,l=0,r=0;
		
		while(l<leftsize && r<rightsize) {
			if(leftarray[l]<rightarray[r]) {
				array[i]=leftarray[l];
				i++;
				l++;
			}
			else{
				array[i]=rightarray[r];
				i++;
				r++;
			}
		}
		while(l<leftsize) {
			array[i]=leftarray[l];
			i++;
			l++;
		}
		while(r<rightsize) {
			array[i]=rightarray[r];
			i++;
			r++;
		}	
	}
	}
