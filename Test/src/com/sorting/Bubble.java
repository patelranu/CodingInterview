package com.sorting;


//largest elements should be placed at last
//when we start from 0 then it extends less then size
//when  largest elemt reached last index then index also decrease in j loop.
public class Bubble {
	public static void main(String[] args) {
		int a[]={5,1,4,2,8,3,9,0};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int x:a)
			System.out.println(x);
	}

}
