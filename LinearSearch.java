package dataStructures;

public class LinearSearch {
	public static int linearSearch(int a[], int target) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==target)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int a[] = {2,5,3,7,8,4};
		int target = 8;
		int result = linearSearch(a,target);
		if(result==-1)
			System.out.println("Element is not present in the array"); 
		else
			System.out.println("Element is present at " + result +" position of array");
	}

}
