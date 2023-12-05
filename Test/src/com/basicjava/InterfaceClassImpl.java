package com.basicjava;

//if we have interface and class then importance first is class priority...
//we can override default method impl of interface
interface A{
	default void c(){
		System.out.println("A");
	}
}
interface D{
	default void c(){
		System.out.println("D");
	}
}
class B {
	public void c(){
		System.out.println("C");
	}
}
class C extends B implements A {
	public void c(){
		System.out.println("C");
	}
}
public class InterfaceClassImpl {
 public static void main(String[] args){
	A obj=new C();
	obj.c();
  }
}
