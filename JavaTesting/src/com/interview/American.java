package com.interview;

public class American {
	public static void main(String[] args) {
		int a[]={5,19,8,1};
		int x=minfilter(a);
		System.out.println(x);
	}

	private static int  minfilter(int[] a) {
		int sum=0;
		int filter=0;
		int count=0;
		for(int x:a)
			sum=sum+x;
		
		int division=sum/2;
		while(division>2){
			for(int i=0;i<a.length;i++){
				if(a[i]>=division){
					a[i]=a[i]/2;
					count++;
				}
					
					
				filter=filter+a[i];
			}
			if(!(filter<=(sum/2))){
				division=division/2;
				filter=0;
			}
			   
			
			else
			 return count;
		}
		return count;
		
		
	}

}
