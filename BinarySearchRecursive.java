package dataStructures;

public class BinarySearchRecursive {
	public static int binarysearch(int a[], int first, int last, int target) {
		int midpoint;
		if(last>=first) {
			midpoint = (last+first)/2;
			if(a[midpoint]==target)
				return midpoint;
			else if(a[midpoint]<target)
				return binarysearch(a,midpoint+1,last,target);
			else
				return binarysearch(a,first,midpoint-1,target);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int target = 2;
		int n = a.length;
		int result = binarysearch(a,0,n-1,target);
		if(result==-1)
			System.out.println("Element is not present in the array"); 
		else
			System.out.println("Element is present at " + result +" position of array");
	}

}
