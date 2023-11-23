package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SynechTest {

	public static void main(String[] args) {

		int even = 0;
		List<Integer> list = Arrays.asList(1, 2, 5, 8, 9);
		list = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		for (int a : list) {
        if (even < a) {
				even = a;

			}
		}
		System.out.println(even);

	}

	 public static int getEvenNumber(Integer a){
	 return a;
	
	 }

}
