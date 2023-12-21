package com.basicjava;

//static method can not be override...no compliation error but always call 
//parent method hiding
//method override- normal method override
//method hide- even child object create but method parent is call
abstract class Parent {
	abstract void draw();

	Parent() {
		System.out.println("parents constr");
	}

	static void cube(int x) {
		System.out.println(x * x);
	}
}

class Child extends Parent {
	Child() {
		System.out.println("child constr");
	}

	public void draw() {
		System.out.println("drawing rectangle");
	}

	static void cube(int x) {
		System.out.println(x + x +"child");
	}

	public void getValues(int... a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		Parent d = new Child();
		d.draw();
		d.cube(3);
		// d.getValues(1,2,3,4,500,534630004);

	}
}
