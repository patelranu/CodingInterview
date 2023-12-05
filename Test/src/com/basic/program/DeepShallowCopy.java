package com.basic.program;
//deep create new object .
//shallow =1 obje and 2 reference

final class Address{
	int x,y;
	
}

public class DeepShallowCopy {
	public static void main(String[] args) {
		Address obj=new Address();
		obj.x=10;
		obj.y=20;
		System.out.println("before...."+obj.x +"....."+obj.y);
		Address obj1=obj; //shallow refrence is share
		obj1.x=15;
		System.out.println(obj.x +"....."+obj.y);
		System.out.println(obj1.x +"....."+obj1.y);
		System.out.println("deep copy.....................");
		
		Address obj3=new Address(); //deep new keyword create new memory area
		obj3.x=obj.x;
		obj3.y=obj.y;
		System.out.println(obj3.x +"....."+obj3.y);
		obj3.x=40;
		System.out.println(obj3.x +"....."+obj3.y);
		
		System.out.println(obj.x +"....."+obj.y);
}

}
