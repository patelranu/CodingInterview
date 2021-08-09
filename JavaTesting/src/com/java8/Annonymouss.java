package com.java8;
//annonymous inner class i.e the class without name
//change implementation without method overriding...so we can go anonymous class
class Anum{
	public void show(int x){
		System.out.println("welcome before change....."+x);
	}
}
public class Annonymouss {
	public static void main(String[] args) {
		Anum obj=(int y)->{
			public void show(int x){
				System.out.println("welcome after..........."+x);
			}
		};obj.show(5);

	}

}
