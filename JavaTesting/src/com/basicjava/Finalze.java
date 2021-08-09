package com.basicjava;
class Finalzer{
	int a=10;
	
	 public void finalize()   
	    {   
	        System.out.println("finalize method called");   
	    }   
}

public class Finalze {
public static void main(String[] args) {
	Finalzer obj=new Finalzer();
	System.out.println(obj.hashCode());
	obj=null;
	System.gc();
}
}
