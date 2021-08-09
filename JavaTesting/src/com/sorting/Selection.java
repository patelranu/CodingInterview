package com.sorting;
//selection put min value at first.....
public class Selection {
	public static void main(String[] args) {
		int a[]={5,12,14,3,7,4};
		int b[]=new int[a.length];
		int even=0,odd=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;		
				}
			}
		}
		//5,7,9,10,12,14
		if(a[0]%2!=0){
			b[odd]=a[0];
		    odd=odd+2;
		    even=even+1;
		}else{
			b[even]=a[0];
			even=even+2;
			odd=odd+1;
		}
			
		   for(int i=1;i<a.length;i++){
			   if(a[i]%2==0){
				   b[even]=a[i];
				   even=even+2;
				}else{
				   b[odd]=a[i];
				   odd=odd+2;
			   }
		   }
		

			for(int x:b){
				System.out.println(x);
			}
		
		
		
		
	}

}
