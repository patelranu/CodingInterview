package com.core;
import com.core.A.B;

class  A{
   static void show(){
		System.out.println("a");
	}
	static class B extends A{
		static void show(){
			System.out.println("b");
		}
		static void showd(){
			System.out.println("b");
		}	
	}
}
public  class First {
	public static void main(String[] args) {
		A obj=new A();
		obj.show();
		A.B.show();
		//B ob=new B();
		//ob.show();
		
	}
	

}
