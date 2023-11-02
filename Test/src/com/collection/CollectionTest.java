package com.collection;

import java.util.HashMap;

public class CollectionTest {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		String a[]={"a","b","c","a"};
		for(String x: a){
			if(map.containsKey(x)){
				map.put(x, map.get(x)+1);
			}else{
				map.put(x, 0);	
			}
		}
		System.out.println(map);
	}

}
