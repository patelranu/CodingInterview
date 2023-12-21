package com.basicjava;
//that has a fixed set of constant values- public static final.
//we can’t create the instance of the Enum keyword because,
//it contains private constructors only.
enum Laptop{
	HP(1000),DELL(5000),APPLE(3000);
	private int price;

	private Laptop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
public class EnumClass {
public static void main(String[] args) {
	System.out.println(Laptop.APPLE.getPrice());
	for(Laptop i:Laptop.values()){
		System.out.println(i);
	}
}
}
