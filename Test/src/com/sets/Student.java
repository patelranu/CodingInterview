package com.sets;

public class Student /*implements Comparable<Student>*/ {
	int id;
	String name;
	
public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*@Override
	public int compareTo(Student obj) {
		System.out.println("...........");
	System.out.println(this.id);
	System.out.println(obj.id);
	System.out.println("..................");
		if(this.id>obj.id)
		return 1; //this come after obj
		else if(this.id<obj.id)
			return -1; //this come before obj
		else
		return 0;*/
	}
	
	
	
	
	
	
	


