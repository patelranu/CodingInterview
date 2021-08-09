package com.basicjava;

//if we have interface and class then importance first is class priority...
interface A{
	default void c(){
		System.out.println("c");
	}
}
class B {
	public void c(){
		System.out.println("b");
	}
}
class C extends B implements A{
}
public class Mutiple {
 public static void main(String[] args){
	C obj=new C();
	obj.c();
  }
}
