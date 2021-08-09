package com.sorting;

//first find out lenght
//sort(a,n)
//confition check n should be greate then 2
//create two array 0-mid,(mid,n-mid
//left array(0,mid)
//right(mid,n-mid)
//mergesort(a,left,right, mid,n-mid)

public class MergeSort {
	public static void main(String[] args) {
		int a[]={3,6,7,1,9,4,0};
		int n=a.length;
		MSort obj=new MSort();
		obj.sort(a,n);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		}
		
		
	}

	


