package com.basicjava;
// we can override static method, but always parent call method is called eventhough 
 //if we call from child class object.
// in Func overloading always parameeter should be different, 

class ClassA{
	int show(){
		System.out.println("int show");
		return 0;
	}
	float show(int x){
		return 0;
	}
	static void methodcall(){
		System.out.println("static parent");
	}
}
class ClassB extends ClassA{
	static void methodcall(){
		System.out.println("child");
	}
	float show(int x){
		System.out.println("child call");
		return 0;
	}
}

public class FunctionOverload {
	public static void main(String[] args) {
		ClassA obj=new ClassB();
     obj.methodcall();
		obj.show(5);
	}

}
