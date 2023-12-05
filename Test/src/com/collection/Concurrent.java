package com.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
//concurrent we can add more obj during iteration
//hashmap we connot add/remove object in map,but we can modified existing map

public class Concurrent {
	public static void main(String[] args) {
		
		
		
//		Map<Integer, String>hashMap= new HashMap<>();
//		hashMap.put(1, "c");
//		hashMap.put(2,"d");
//		for(Map.Entry<Integer, String> obj: hashMap.entrySet()){
//			//System.out.println(obj.getValue());
//			hashMap.put(1, "cd");
//		}
//		System.out.println(hashMap);
		
		ConcurrentHashMap<Integer, String>map= new ConcurrentHashMap<>();
		map.put(1, "a");
		map.put(2,"b");
		map.put(3, "ac");
		for(Map.Entry<Integer, String> obj: map.entrySet()){
			map.remove(2);
			System.out.println(obj.getKey() +"......"+obj.getValue());
			map.put(3, "ab");
			
			
		}
		System.out.println(map);
		
//		List<Integer> list=Arrays.asList(1,2,3,4);
//		Iterator itr=list.iterator();
//		while(itr.hasNext()){
//			  System.out.println(itr.next());
//			  list.remove(0);
//		}
	
	
	}

}
