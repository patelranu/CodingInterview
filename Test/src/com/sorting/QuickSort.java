package com.sorting;

public class QuickSort {
	public static void main(String[] args) {
		int a[]={3,6,1,9,7,5};
		QSort obj=new QSort();
		obj.quickSort(a,0,a.length-1);
		for(int i:a){
			System.out.println(i);
		}
		
	}

}
