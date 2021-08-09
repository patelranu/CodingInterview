package com.array;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicate {
	public static void main(String[] args) {
		String a[]={"java","ranu","ruby","java","rash","java","rash","ruby","ruby"};
		System.out.println(a.length);
		String[] b=new String[a.length];
		int k=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<=a.length-1;j++){
				if(a[i].equals(a[j])){
					if(!Arrays.asList(b).contains(a[i])){
						System.out.println(a[i]);
						b[k++]=a[i];
					}
					 
					
					break;
				}
			}
		}
	}

}
