package com.java8;

class Z{
	int i=10;
	static class P{
		public void disp(){
			System.out.println("static method.....");
		}
	}
	//member inner class
	class B{
		int p=10;
		public void show(){
			System.out.println("welcome to the show.......");
		}
	}
}



public class InnerClasses {
	public static void main(String[] args) {
		Z obj=new Z();
		Z.P sta=new Z.P();  //static clas 
		  Z.B object= obj.new B(); //member class
		System.out.println(obj.i);
		object.show();
		sta.disp();
	}

}
