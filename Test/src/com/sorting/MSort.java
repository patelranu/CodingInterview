package com.sorting;

public class MSort {

	public void sort(int[] a, int n) {
	    if(n<2)
	    	return;
	    else{
	    	int mid=n/2;
	    	int l[]=new int[mid];
	    	int r[]=new int[n-mid];
	    	for(int i=0;i<mid;i++)
	    		l[i]=a[i];
	    	for(int j=mid;j<n;j++)
	    		r[j-mid]=a[j];
	    	sort(l,mid);
	    	sort(r,n-mid);
	    	mergesort(a,l,r,mid,n-mid);
	    }
		
	}

	private void mergesort(int[] a, int[] l, int[] r, int left, int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right){
			if(l[i]<=r[j]){
				a[k++]=l[i++];
			}else{
				a[k++]=r[j++];
			}
		}
		while(i<left){
			a[k++]=l[i++];
		}
		while(j<right){
			a[k++]=r[j++];
		}
		
		
	}
	
}
