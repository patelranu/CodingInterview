package com.java8;

import java.util.*;
import java.util.stream.Collectors;

//filter
//min max count,reduce 
//method reference ::

public class FilterUse {
	public static void main(String[] args) {
		List<Integer> value=Arrays.asList(1,2,3,4,5,6,7,8);
		value.stream().filter(i->i%2==0).forEach(System.out::print);
		//System.out.println(value.stream().filter(i->i%2==0).collect(Collectors.toList()));
		
	//map
		/*List<String> a=Arrays.asList("1","2","3","4");
		a.stream()
		.map(i->Integer.valueOf(i))
		.filter(i->i % 2==0)
		.forEach(System.out::println);*/
	 
		List<String>s=Arrays.asList("ranu","rash");
		 s.stream()
	     .map(i->i.toUpperCase())
	      .forEach(System.out::println);
	
	}

}
