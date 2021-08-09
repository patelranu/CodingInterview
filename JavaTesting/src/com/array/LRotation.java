package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LRotation {
	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5};     
		int temp=0;
		int count=1;
		int total=4;
		while(count<=total){
			for(int i=0;i<a.length;i++){
				if(i==0){
					temp=a[i]; continue;
				}
				if(i==a.length){
					a[a.length-1]=temp; break;
				}a[i-1]=a[i];  
			}
			count++;
		}
		
	 for(int x:a)
		System.out.println(x);
		
		
	}

}
