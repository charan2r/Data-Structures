package dataStructures;

public class BinarySearchIterative {
	public static int binarySearch(int a[], int target) {
		int first = 0;
		int last = a.length-1;
		while(first<=last) {
			int midpoint = (first+last)/2;
			if(a[midpoint]==target)
				return midpoint;
			else if(a[midpoint]<target)
				return midpoint+1;
			else
				return midpoint-1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int target = 4;
		int result = binarySearch(a,target);
		if(result==-1)
			System.out.println("Element is not present in the array"); 
		else
			System.out.println("Element is present at " + result +" position of array");
	}

}
