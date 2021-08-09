package com.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomCompare {
	public static void main(String[] args) {
	  List<Student>object=new ArrayList<>();
	  object.add(new Student(10,"ranu"));
	  object.add(new Student(5,"rans"));
	  object.add(new Student(12,"pree"));
	  object.add(new Student(9,"sang"));
	  object.add(new Student(1,"rash"));
		//Collections.sort(object);
		/*for(Student o:object){
			System.out.println(o.id);
		}*/
		Comparator<Student> obj=new Comparator<Student>(){
          @Override
          //s1 this object which is random, s2 is object which we r passing..
			public int compare(Student s1, Student s2) {
				if(s1.id>s2.id)
					return 1;
					else return -1;
			}
		};
		 Collections.sort(object,obj);
		 for(Student o:object){
				System.out.println(o.id);
			}
		
		
		/*List<Integer>obj=new ArrayList<>();
		obj.add(10);
		obj.add(6);
		obj.add(12);
		obj.add(13);
		obj.add(8);
		Collections.sort(obj);
		for(Integer i:obj){
			System.out.println(i);
		}*/
		/*List<String> o=new ArrayList<>();
		o.add("ranu");
		o.add("rash");
		o.add("pree");
		Collections.sort(o);
		for(String i:o){
			System.out.println(i);
		}*/
	}

}
