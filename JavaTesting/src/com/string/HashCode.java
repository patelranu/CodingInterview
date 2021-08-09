package com.string;

import java.util.HashMap;
import java.util.Map;

//hashCodes are equal -> Objects might be equal -> further comparision is required
//hashCodes are different -> Object are not equal (if hashCode is implemented right)

public class HashCode {
 public static void main(String[] args) {
	 Map<Integer, Integer> map = new HashMap<Integer, Integer>();
     map.put(1, 11);
     map.put(4, 10);
     System.out.println(map.hashCode());
     Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
     map1.put(1, 10);
     map1.put(4, 11);
     System.out.println(map1.hashCode());
     if (map.equals(map1)) {
         System.out.println("equal ");
     }
}
}
