package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;

public class MinMaxFunction {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
        list.add(9);
		list.add(5);
		list.add(7);
		list.add(8);
		list.remove(0);
		list.stream().sorted().forEach(i->System.out.print(i));
		System.out.println(";;;;;;;;;;;;;;;;;;;;;");
		System.out.print(list.stream().findFirst().orElse(0));
		System.out.println(";;;;;;;;;;;;;;;;;;;;;");
		OptionalInt max=list.stream().mapToInt(i->i).max();
		OptionalInt min=list.stream().mapToInt(i->i).min();
		System.out.println(";;;;;;;;;;;;;;;;;;;;;");


	   
		
	}

}
