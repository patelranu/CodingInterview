package com.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashCodes {
	public static void main(String[] args) {
		Integer a = new Integer(1);
		Integer b = new Integer(1);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "sss");
		map.put(1, "fgf");
		map.put(2, "fgf");
		System.out.println(map.size());
		for(Entry<Integer, String> obj:map.entrySet()){
			System.out.println(obj.getKey() +" "+obj.getValue());
		}
	} 
	}


