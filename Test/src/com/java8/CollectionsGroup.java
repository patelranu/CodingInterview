package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.interview.Employe;

public class CollectionsGroup {
	public static void main(String[] args) {
		List<Employe> list = new ArrayList<>();

		list.add(new Employe(1, "ranu", 25, 4000));
		list.add(new Employe(5, "rash", 28, 3000));
		list.add(new Employe(4, "anjna", 12, 4000));
		list.add(new Employe(2, "bro", 10, 7000));
		list.add(new Employe(6, "preet", 28, 9000));
		list.add(new Employe(6, "preet", 28, 9000));
		// list.stream().forEach(System.out::println);

		// System.out.println("sorting..........");
		// Collections.sort(list,
		// (i1,i2)->Integer.valueOf(i1.getRating()).compareTo(Integer.valueOf(i2.getRating())));
		// list.stream().forEach(System.out::println);

		// System.out.println("reverse sorting..........");
		//Collections.sort(list, (i1, i2) -> Integer.valueOf(i2.getRating()).compareTo(Integer.valueOf(i1.getRating())));
		//list.stream().forEach(System.out::println);
		
		//group by age
	 //Map<Integer,List<Employe>>map=list.stream().collect(Collectors.groupingBy(Employe ::getAge));
	// map.entrySet().forEach(System.out::println);
	 
	 //grup by age set
		//Map<Integer,Set<Employe>>map=list.stream().collect(Collectors.groupingBy(Employe ::getAge,Collectors.toSet()));
	   //map.entrySet().forEach(System.out::println);
	   
	 //grup by age, asce set
	 		Map<Integer,Set<Employe>>map=list.stream().collect(Collectors.groupingBy(Employe ::getAge,TreeMap::new,Collectors.toSet()));
	 	   map.entrySet().forEach(System.out::println);
	 	   
	 	  
	}

}
