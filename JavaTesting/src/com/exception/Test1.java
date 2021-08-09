package com.exception;

public class Test1 extends Exception {
	public Test1(String s) {
		super(s);
	}
	

	public Test1() {
		
	}


	public static void main(String[] args) {
            try{
			 System.out.println("My Custom Exception test");
			throw new Test1();
			
		}catch(Exception s){
			System.out.println("Test Exception");
		}
	}

}
