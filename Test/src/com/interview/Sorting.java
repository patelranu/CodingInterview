package com.interview;
class SortingExample{

	public int searchShortElement(int[] a, int kthElement) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		return kthElement(a,kthElement);
	}

	private int kthElement(int[] a, int kthElement) {
		//{2,2,3,3,5,7,8,9};
		int element=a[0];
		int count=1;
		for(int i=1;i<a.length;i++){
			if(a[i]>element && count<=kthElement){
				element=a[i];
				count++;
			}
			if(count==kthElement)
				break;
		}
		if(count==kthElement)
			return element;
		else
			return 0;
		
	}
	
}

public class Sorting {
	public static void main(String[] args) {
		SortingExample obj=new SortingExample();
		int a[]={9,3,2,7,2,5,3,8};
		int element=2;
	  System.out.println(obj.searchShortElement(a,element));
		
	}
}
