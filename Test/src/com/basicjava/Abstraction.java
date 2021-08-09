package com.basicjava;

abstract class AB{
	int a;
	public abstract void disp();
	AB(int x){
		this.a=x;
		System.out.println("constract...");
	}
	public void show(){
		System.out.println("show method...");
	}
	
}
class BC extends AB{
	int b;
	BC(int x,int y){
		super(y);
		b=x;
	}
  public void disp() {
  System.out.println("BC method....");		
}
	
}

public class Abstraction {
	public static void main(String[] args) {
	AB obj=new BC(2,4);
	obj.disp();
	obj.show();
	System.out.println(obj.a);
}

}
