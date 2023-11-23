package com.basicjava;
class Vars{
	final int x=10;
//	{
//		x=6;
//	}
//	Vars(){
//		x=7;
//	}
	
	public  void x(){
		System.out.println("parent...." +x);
	}
};
class VarsChild extends Vars{
	public void x(){
		System.out.println("child....");
	}
}

public class FinalVar {
	public static void main(String[] args) {
		Vars o=new Vars();
		o.x();
	}

}
