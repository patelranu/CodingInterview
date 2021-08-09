package com.core;

public class Ex {
	public static void main(String[] args){
		
		/*System.out.println("hello ranu");
		  division();*/
		try{
			System.out.println("hello ranu");
			division();		
		  
		}/*catch(Exception e){
			System.out.println("hello");
		}*/finally{
			System.out.println("end");	
		}
	}

	private static void division() {
		int a=6;
		int c=a/2;
		again();
        /*try{
			int c=a/2;
			again();
		}catch(Exception e){
			System.out.println("hi");
		}*/
	}

	private static void again() {
		String a=null;
		System.out.println(a.length());
		
	}
	

}
