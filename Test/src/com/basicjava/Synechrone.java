package com.basicjava;
// we can override static method, but always parent call method is called eventhough 
 //if we call from child class object.
// in Func overloading always parameeter should be different, 

class Overload{
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
class OverloadParent extends Overload{
	static void methodcall(){
		System.out.println("child");
	}
	float show(int x){
		System.out.println("child call");
		return 0;
	}
}

public class Synechrone {
	public static void main(String[] args) {
		Overload obj=new OverloadParent();
     obj.methodcall();
		obj.show(5);
	}

}
