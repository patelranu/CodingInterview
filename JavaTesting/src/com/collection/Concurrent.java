package com.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
//concurrent we can add more obj during iteration
//hashmap we connot add more object in map

public class Concurrent {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4);
		Map<Integer, String>map1= new HashMap<>();
		map1.put(1, "c");
		map1.put(2,"d");
		Map<Integer, String>map= new ConcurrentHashMap<>();
		map.put(1, "a");
		map.put(2,"b");
		for(Map.Entry<Integer, String> obj: map.entrySet()){
			if(obj.getKey()==1)
				map.put(3, "ab");
		}
		for(Map.Entry<Integer, String> obj: map1.entrySet()){
			//System.out.println(obj.getValue());
			 map.put(3, "cd");
		}
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			  System.out.println(itr.next());
			  list.remove(0);
		}
	//	System.out.println(map);
		//System.out.println(map1);
	
	}

}
