package com.collection;
//asc o1>02 +
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employe{
	int id;
	String name;
	public Employe(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}

public class Comparators {
	public static void main(String[] args) {
		List<Employe> obj=new ArrayList<>();
		obj.add(new Employe(1,"ranu"));
		obj.add(new Employe(2,"rash"));
		obj.add(new Employe(3,"ruby"));
		obj.add(new Employe(6,"raj"));
		obj.add(new Employe(5,"anju"));
		
		
		Comparator<Employe> ob=new Comparator<Employe>(){

			@Override
			public int compare(Employe o1, Employe o2) {
				if(o1.id>o2.id)
					return 1;
				else if(o1.id<o2.id)
					return -1;
				else
				   return 0;
			}
        };
		Collections.sort(obj,ob);
		for(Employe o:obj){
			System.out.println(o.id +" "+o.name);
		}
		
	}

}
