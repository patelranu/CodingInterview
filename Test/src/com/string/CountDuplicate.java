package com.string;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//value of convert int to Integer object
//convert Integer into int -Integer.intValue(9);

import sun.security.pkcs11.wrapper.Functions;

public class CountDuplicate {
	public static void main(String[] args) {
		 String s = "geeksforgeeks";
		 
		  s.chars().mapToObj(i->Character.toLowerCase(Character.valueOf((char)i)))
		 .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
		 .entrySet().stream()
         .filter(entry -> entry.getValue() == 1L)
         .map(entry -> entry.getKey())
         .findFirst().get();
		 
		 
		 
		 
		 
		 char[] c= s.toCharArray();
		 Map<Character, Integer>map=new LinkedHashMap<>();
		 for(char x:c){
			 if(map.containsKey(x))
					 map.put(Character.valueOf(x), map.get(Character.valueOf(x))+1);
			 else
				 map.put(Character.valueOf(x), 1);
			}
		 for(Map.Entry<Character, Integer> x:map.entrySet()){
			  if(x.getValue()==1){
				  System.out.println(x.getKey());
				  break;
			  }
		  }
		 }
			

}
