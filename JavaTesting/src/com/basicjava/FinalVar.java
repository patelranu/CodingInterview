package com.basicjava;
class Vars{
	static int x;
	Vars(){
		x=7;
	}
	
	public  void x(){
		System.out.println("parent....");
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
