package com.java8;

//In functional Interface we have many default implelemtation method but have only one abstract method
// lambda work only functional interface that have only one method
@FunctionalInterface
interface LambdaClass{
	void show();
	default void display(){
		System.out.println("default implement");
	}
	String toString();
	
}

public class FuncLambda {
	public static void main(String[] args) {
		LambdaClass obj=()->{
			System.out.println("show method implement");
			
		};
		
		obj.show();
		obj.display();
		
		
	}

}
