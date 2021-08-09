package com.interview;

public class Amazon {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8};
		int mid=a.length/2;
		   int result=findPivot(a,mid);
		   System.out.println(result);
		   System.out.println(a[result]);
	}
   private static int findPivot(int[] a, int mid) {
		    int lsum=0;
		    int rsum=0;
		   for(int i=0;i<mid;i++)
			   lsum=lsum+a[i];
		   for(int j=mid+1;j<a.length;j++)
	    	  rsum=rsum+a[j];
	     if(lsum==rsum)
	    	     return mid;
	    	 else if(lsum<rsum)
	    		 return findPivot(a,mid+1);
	    	 else
	    		 return findPivot(a,mid-1);
	     
	}

}
