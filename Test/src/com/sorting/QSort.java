package com.sorting;

public class QSort {
  public void quickSort(int[] a, int start, int end) {
		if(start<end){
		    
			int index=partion(a,start,end);
			quickSort(a,start,index-1);
			quickSort(a,index+1,end);
		}
		
	}

private int partion(int[] a, int start, int end) {
	int pivot=a[end];
	int index=start;
	for(int i=start;i<end-1;i++){
		if(a[i]<=pivot){
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
			index++;
		}
	}
	int temp=a[index];
	a[index]=a[end];
	a[end]=temp;
	return index;
	
	
}

}
