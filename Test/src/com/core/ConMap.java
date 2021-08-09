package com.core;

import java.util.HashMap;
import java.util.Iterator;

public class ConMap {
	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		System.out.println(map.get(1));
		 Iterator<Integer> itr = map.keySet().iterator();
        
	        //Using synchronized block is advisable
	        
	            while(itr.hasNext()) {
	            	map.put(2, "c");
	                System.out.println(map.get(itr.next()));
	            }
	        }
	}


