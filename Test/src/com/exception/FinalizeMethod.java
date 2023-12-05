package com.exception;
class Finalize{
	Finalize(){
		System.out.println("hello");
		
	}
	public void finalize(){
		System.out.println("finalizer call");
	}
}

public class FinalizeMethod {
	public static void main(String[] args) {
		Finalize obj=new Finalize();
		
	    obj=null;
	    System.gc();
	    System.out.println("end of application");
	    //System.gc();
	}

}
