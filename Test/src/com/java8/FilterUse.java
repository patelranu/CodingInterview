package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filter
//min max count,reduce 
//method reference ::

public class FilterUse {
	public static void main(String[] args) {
		List<Integer> value = Arrays.asList(1, 2, 3, 4, 5,12);
		// sum
		//System.out.println(value.stream().reduce(0,(i,j)->i+j));
		// filter
		// System.out.println(value.stream().filter(i->i%2==0).collect(Collectors.toList()));
		// after stream
		// System.out.println(value.stream().findFirst().orElse(0));
		//map
		 System.out.println(value.stream().map(i->i*2)
				 .collect(Collectors.toList()));
		//filter map
		System.out.println(value.stream()
				.filter(FilterUse::filterMethod)
				.map(FilterUse::mapMethod)
				.collect(Collectors.toList()));
		
		
		
		int countresult=(int) value.stream().count();
				//.filter(i->i%2==0).count();
		System.out.println(countresult);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// value.stream().filter(i->i%2==0).forEach(System.out::print);
		// System.out.println(value.stream().filter(i->i%2==0).collect(Collectors.toList()));

		// map
		/*
		 * List<String> a=Arrays.asList("1","2","3","4"); a.stream()
		 * .map(i->Integer.valueOf(i)) .filter(i->i % 2==0)
		 * .forEach(System.out::println);
		 */

		// List<String>s=Arrays.asList("ranu","rash");
		// s.stream()
		// .map(i->i.toUpperCase())
		// .forEach(System.out::println);

	}

	public static boolean filterMethod(int i) {
		System.out.println("call method");
		return i % 3 == 0;

	}
	public static int mapMethod(int i) {
		System.out.println("mapping method");
		return i=i*2;

	}

}
