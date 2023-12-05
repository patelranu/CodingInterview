package com.collection;

import java.util.*;
import java.util.ArrayList;

public class CollectionTesting {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 5);
		Collection<Integer> list1=Collections.unmodifiableCollection(list);
		for (int i : list1) {
			System.out.println(i);
			list.set(3, 10);
			list.add(6);
		}
		
		ArrayList<Integer>i=new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(5);
		for (int a : i) {
			i.set(0, 10);
			System.out.println(a);
			
		}
	}
}
