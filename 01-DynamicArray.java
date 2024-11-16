//--Main Class
package dataStructures;

public class Main {
	public static void main(String[] args) {
	
		DynamicArray darr=new DynamicArray(7);
		
		System.out.println("Capacity:"+darr.capacity);
		
		//Adding the Objects to the data Variable
			darr.add("Elementary");
			darr.add("High School");
			darr.add("Higher Sec School");
		//Performing Insertion  Operation
			darr.insert(2, "Bachelor's");
			darr.insert(4, "Masters");
		//Deletion
			darr.delete("High School");
			
		System.out.println(darr);
		System.out.println("Empty:"+darr.isEmpty());
		System.out.println("Element is At:"+darr.search("High School")+" index");
		
	}
}



package dataStructures;

public class DynamicArray {

	int size;//Value Stored
	int capacity=10;
	Object[] arr;
	
	DynamicArray(){
		this.arr=new Object[capacity];
	}
	
	DynamicArray(int capacity) {
		this.capacity=capacity;
		this.arr=new Object[capacity];
	}
	public void add(Object data) {
		if(size>=capacity) {
			grow();
		}
		arr[size]=data;
		size++;
	}
	
	public void insert(int index,Object data) {
		if(size>=capacity) {
			grow();
		}
		for(int i=size;i>index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=data;
		size++;
	}
	
	public int search(Object data) {
		for(int i=0;i<=size;i++) {
			if(arr[i]==data) {
				return i;
			}
		}
		return -1;
	}
	
	public void delete(Object data) {
		for(int i=0;i<size;i++) {
			if(arr[i]==data) {
				for(int j=0;j< (size-i-1);j++) {
					arr[i+j]=arr[i+j+1];
				}
				arr[size-1]=null;
				size--;
				if(size<=(int)(capacity/3)) {
					shrink();
				}
				break;
			}
	}
	}
	
	public void grow() {
		int newCapacity=(int)(capacity*2);
		Object[] newArray=new Object[newCapacity];
		for(int i=0;i<size;i++) {
			newArray[i]=arr[i];
		}
		 capacity=newCapacity;
		 arr=newArray;
	}
	
	public void shrink() {
		int newCapacity=(int)(capacity / 2);
		Object[] newArray=new Object[newCapacity];
		for(int i=0;i<size;i++) {
			newArray[i]=arr[i];
		}
		 capacity=newCapacity;
		 arr=newArray;
	}
	
	public String toString() {
		String string="";
		
		for(int i=0;i<size;i++) {
			string+=arr[i]+" , ";
		}
		if(string!="") {
			string ="["+string.substring(0,string.length()-2)+"]";
		}
		else {
			string="["+"]";
			//string="[]";
		}
		return string;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	
}