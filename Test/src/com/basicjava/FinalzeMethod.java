package com.basicjava;
//finalize always call at the end of class
class Finalzer{
	public void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
}

public class FinalzeMethod {
public static void main(String[] args) {
	Finalzer obj=new Finalzer();
	System.out.println(obj.hashCode());
	obj=null;
	System.gc();
	System.out.println("showwww");
}
}
