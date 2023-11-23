package com.java8;

//annonymous inner class i.e the class without name
//change implementation without method overriding...so we can go anonymous class
class Anum {
	public void show() {
		System.out.println("welcome before change.....");
	}

	public void display(int x) {
		System.out.println("display method before.....");
	}
}

public class Annonymouss {
	public static void main(String[] args) {
		Anum obj;
		obj = new Anum() {
			public void show() {
				System.out.println("welcome after...........");
			}
			public void display(int x) {
				System.out.println("display method after....."+x);
			}
		};
		
		obj.show();
		obj.display(6);
	}

}
