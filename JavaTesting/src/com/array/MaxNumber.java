package com.array;

public class MaxNumber {
	public static void main(String[] args) {
		int a[]={1,8,80,4,70};
		
		int first=a[0];
		int second=a[1];
		if(first<second){
			first=a[1];
			second=a[0];
		}
		for(int i=2;i<a.length;i++){
			if(a[i]>first){
				int temp=first;
				first=a[i];
				second=temp;
			}else if(a[i]>second && a[i]<first)
				 second=a[i];
		}
		System.out.println(first);
		System.out.println(second);
		
		
	}

}
