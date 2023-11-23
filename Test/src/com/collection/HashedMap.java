package com.collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
//hash Map check duplicate key by equal method
//identity hash map use == compare for duplicate key.
public class HashedMap {
	public static void main(String[] args) {
//		HashMap<Object,String> obj=new HashMap<>();
//		obj.put(new Integer(10), "a");
//		obj.put(new Integer(10), "b");
//		obj.put(10, "c");
//		for(Map.Entry x:obj.entrySet()){
//			System.out.println(x.getKey()+" "+x.getValue());
//		}
		
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "ranu");
		map.put(4, "preeti");
		map.put(2, "ruby");
		map.put(5, "bro");
		
	for(Map.Entry<Integer,String> m:map.entrySet()){
		System.out.println(m.getKey() +" "+m.getValue());
	}
	
	//map.entrySet().stream().sorted();
	
	map.entrySet().stream()
	.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	.forEach(System.out::println);    
	
	}

}
