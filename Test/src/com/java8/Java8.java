package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Java8 {
	public static void main(String[] args) {
		int a[]={1,2,3,4,5};
		  //Int-int
		Integer aI[]=Arrays.stream(a).boxed().toArray(Integer[]::new);
		   //List-array
		List<Integer> list=Arrays.stream(a).boxed().collect(Collectors.toList());
		  // array-list
		int ax[]=list.stream().mapToInt(Integer::intValue).toArray();
		String s1=new String("ha");  
		String s2="hello";  
		String s3=s2.intern();
		System.out.println(s1+'h');
	
		
		
		
		
		 
		
		
	}

}
