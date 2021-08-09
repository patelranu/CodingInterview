package com.java8;
//priority (interface, abstract class)-> class

 interface A{
	default void show(){
		System.out.println("functional interface");
	}
}
abstract class B{
	public  void show(){
		 System.out.println("abstract class");
	 }
 }
 class C extends B implements A{
	 public void show(){
		 System.out.println("main c class");
	 }
 }

public class FunctionalInt {
	public static void main(String[] args) {
		B obj=new C();
		obj.show();
	}

}
