package com.basicjava;

class Cab implements Cloneable{
	int x=6;

public Object clone() throws CloneNotSupportedException{
	return super.clone();
}
}
public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cab obj=new Cab();
		Cab ob=obj;
		ob.x=9;
	    Cab c=(Cab)obj.clone();
		 c.x=10;
		 System.out.println(obj.x);
		System.out.println(c.x);
	}

}
