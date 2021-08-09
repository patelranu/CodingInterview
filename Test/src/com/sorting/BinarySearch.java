package com.sorting;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};
		int find=4;
		int low=0;
		int high=a.length-1;
		int index=binarySearch(a,find,low,high);
		if(index!=-1)
		System.out.println(a[index] +"is present at index :"+index);
		else
			System.out.println("search value is not avaiable");
	}

	private static int binarySearch(int[] a, int find,int low,int high) {
		if(low>high)
			return -1;
		 int mid= (low+high)/2;
			if(a[mid]==find){
				return mid;
			}else if(a[mid]>find){
				return binarySearch(a,find,low,mid-1);
			}
			return binarySearch(a,find,mid+1,high);
		

		
			
	}

}
