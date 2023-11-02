package com.collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;


//IdentityHashMap use == operator to check object are same or not.
//hashmap use equal method 

public class IdentityHashMaps {
	public static void main(String[] args) {
		IdentityHashMap<Integer,String> map = new IdentityHashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(new Integer(1), "c");
		System.out.println("size of identity hashmap :" +map.size());
		for(Map.Entry<Integer, String> x:map.entrySet()){
			System.out.println( x.getKey()+" "+x.getValue());
		}
		System.out.println("show me...........difference between HashMap & LinkedHashMap");
		
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(new Integer(1), "c");
		System.out.println("size of hashmap :"+map1.size());
		for(Map.Entry<Integer, String> x:map1.entrySet()){
			System.out.println( x.getKey()+" "+x.getValue());
		}
			
	}

}
