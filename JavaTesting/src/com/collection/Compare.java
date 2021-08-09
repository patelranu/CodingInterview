package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//obj1<obj2== if after positive, before negative
//asce obj1 >obj2 (positive)

class Employee implements Comparable<Employee>{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	//1,2,3,4
	public int compareTo(Employee o) {
		if(id<o.id)   //(2,1)
			return 1;
		else if(id>o.id)
			return -1;
		else 
			return 0;
		
	}
}
public class Compare {
	public static void main(String[] args) {
		List<Employee> obj=new ArrayList<>();
		obj.add(new Employee(1,"ranu"));
		obj.add(new Employee(2,"rash"));
		obj.add(new Employee(3,"ruby"));
		obj.add(new Employee(6,"raj"));
		obj.add(new Employee(0,"anju"));
		
		Collections.sort(obj);
		for(Employee o:obj){
			System.out.println(o.id +" "+o.name);
		}
	}

}
