package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EnhanceLoop {
	public static void main(String[] args) {
		List<Integer>value=Arrays.asList(1,2,3,4,5,6,7);
		//normal loop
		/*for(int i=0;i<value.size();i++){
			System.out.println(i);
		}*/
		//enhance forloop
		/*for(int i:value){
			System.out.println(i);
		}*/
		//java 8 
		//value.forEach(i->System.out.println(i));
		//value.forEach(System.out::println);
	Stream list=value.stream();
	System.out.println(list);
	//list.forEach(i->System.out.println(i));
	//list.forEach(i->System.out.println(i));
	}

}
