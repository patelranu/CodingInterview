package com.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
//no oder,allow null,no duplicate value,non synchronized, best in searching
//linkhash-insertion order allow
public class SetImplementation {
	public static void main(String[] args) {
		/*Set<Integer>obj=new HashSet<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(30);
		obj.add(null);
		for(Integer x:obj){
			System.out.println(x);
		}*/
		
		LinkedHashSet obj=new LinkedHashSet();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(30);
		obj.add(null);
		for(Object x:obj){
			System.out.println(x);
		}
		
	}

}
