package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapComparable {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(4, "preeti");
		map.put(1, "ranu");
		map.put(2, "ruby");
		map.put(5, "bro");
		map.put(3, "bro");
		System.out.println(map.values());
		System.out.println(";;;;;;;;");
		System.out.println(map.keySet());
		System.out.println(";;;;;;;;");
		
		List<Map.Entry<Integer, String>>list=new LinkedList<>(map.entrySet());
     
		for(Entry<Integer,String> entry:list){
			System.out.println(entry.getKey() +" "+entry.getValue());
		}
		System.out.println("sorting ;;;;;;;;");
		
		//Collections.sort(list,(i1,i2)->i1.getKey().compareTo(i2.getKey()));
		
		for(Entry<Integer,String>obj:list){
			System.out.println(obj.getKey() +" "+obj.getValue());
		}
			
		System.out.println("sorting Implements;;;;;;;;");
		
		
		HashMap<Integer,String> sorTMap=sortedMap(map);
		
		for(Map.Entry<Integer, String> mapped: sorTMap.entrySet()){
			System.out.println(mapped.getKey()+ " "+mapped.getValue());
		}

		
		
	}

	private static HashMap<Integer,String> sortedMap(HashMap<Integer, String> map) {
	
	List<Map.Entry<Integer,String>>mapList=new LinkedList<Map.Entry<Integer,String>>(map.entrySet());
		
	Collections.sort(mapList, new Comparator<Map.Entry<Integer,String>>(){

		@Override
		public int compare(Entry<Integer, String> obj1, Entry<Integer, String> obj2) {
			return obj2.getKey().compareTo(obj1.getKey());
		}
		
	});
	
	
	HashMap<Integer, String> temp = new HashMap<Integer, String>();	
	for(Entry<Integer,String> entry:mapList){
		temp.put(entry.getKey(), entry.getValue());
	}
	return temp;
	}

}
