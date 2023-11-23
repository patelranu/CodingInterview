package com.basicjava;
//static variable we can defie in const
//non static variable we can not define in static block
//


abstract class AB{
	 static int a;
	 int x;
	static{
		System.out.println("static of a");
	}
	{
		a=11;
		System.out.println("Initialization");
	}
	public abstract void disp();
	AB(int x){
		this.a=x;
		System.out.println("constract..." +a);
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
		System.out.println("child class : "+b);
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
	
}

}
