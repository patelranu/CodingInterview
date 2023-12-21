package com.java8;
//an interface have only one abstract method
//runaaable,comaprable interface interface is a function interface
//lambda expression is used
@FunctionalInterface
 interface Func{
	   final int x=8;
	void show(int x,int y);
	default void display(){
		System.out.println("dispaly default method....");
	}
	static void displaystatic(){
		System.out.println("dispaly static method....");
	}
	
 }

interface Func2 extends Func{
	  final int x=9;
	  default void display(){
			System.out.println("dispaly  func 2 default method....");
	}
}

public interface FuncInterface {
	public static void main(String[] args) {

		Func obj=(int x,int y)->{ x=x*y;
			  
				System.out.println("annonymous.....with Lambda...."+x);
			
		};
		obj.show(8,4);
		obj.display();
		
		System.out.println(obj.x);
		Func.displaystatic();
		
		
		
		
	}
}
