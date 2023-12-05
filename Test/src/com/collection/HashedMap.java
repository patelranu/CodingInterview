package com.collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import com.interview.Employe;

public class HashedMap {
	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, "ranu");
//		map.put(4, "preeti");
//		map.put(2, "ruby");
//		map.put(5, "bro");
//		map.entrySet().stream()
//		.sorted()
//		.forEach(i -> System.out.println(i.getKey() + "" + i.getValue()));
//
//		map.entrySet().stream()
//		.sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
//				.forEach(System.out::println);
		
		HashMap<Employe,String> emp=new HashMap<>();
		emp.put(new Employe(1,"ranu1",20,2000), "ranu");
		emp.put(new Employe(1,"ranu1",20,2000), "rash");
		
		System.out.println(emp.size());
		System.out.println(emp.toString());
		
	}

}
