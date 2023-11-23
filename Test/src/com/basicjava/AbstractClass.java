package com.basicjava;
//static method can not be override...no compliation error but alway call parent 
abstract class Parent {
	abstract void draw();

	Parent() {
		System.out.println("parents");
	}

	static void cube(int x) {
		System.out.println(x * x);
	}
}

class Child extends Parent {
	Child() {
		System.out.println("child");
	}

	public void draw() {
		System.out.println("drawing rectangle");
	}
	static void cube(int x) {
		System.out.println(x +x);
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Parent d = new Child();
		d.draw();
		d.cube(3);
	}
}