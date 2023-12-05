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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
