package com.array;

public class MinSwap {
   public static void main(String[] args) {
	int a[]={4,3,1,2};
    int swapcount=0;
   for(int i=0;i<a.length-1;i++){
		 int minindex=i;
		for(int j=i+1;j<a.length;j++){
			if(a[j]<a[i]){
				if(a[minindex]>a[j])
				minindex=j;
			}
		}
		int temp=a[i];
		a[i]=a[minindex];
		a[minindex]=temp;
		swapcount++;
	}
	System.out.println(swapcount);
	 for(int x:a)
		 System.out.println(x);
	
	}
}

