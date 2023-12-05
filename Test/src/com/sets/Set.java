package com.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;

//no oder,allow null,no duplicate value,non synchronized, best in searching
//linkhashSet-insertion order allow
//hashset internally use hashmap

public class Set {
	public static void main(String[] args) {
		HashSet<Integer>obj=new HashSet<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(30);
		obj.add(null);
		for(Integer x:obj){
			System.out.println(x);
		}
		System.out.println("...........................");
		LinkedHashSet obj1=new LinkedHashSet();
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		obj1.add(30);
		obj1.add(null);
		for(Object x:obj1){
			System.out.println(x);
		}
		
	}

}
