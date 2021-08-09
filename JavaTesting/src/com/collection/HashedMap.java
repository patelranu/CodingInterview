package com.collection;

import java.util.HashMap;
import java.util.Map;
//hash Map check duplicate key by equal method
//identity hash map use == compare for duplicate key.
public class HashedMap {
	public static void main(String[] args) {
		HashMap<Object,String> obj=new HashMap();
		obj.put(new Integer(10), "a");
		obj.put(new Integer(10), "b");
		System.out.println(obj.size());
		for(Map.Entry x:obj.entrySet()){
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
	}

}
