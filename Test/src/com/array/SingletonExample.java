package com.array;

class SingletonObject{
	private static SingletonObject obj=new SingletonObject();
	
  SingletonObject(){
		System.out.println("call");
	}
 public static SingletonObject getObject(){
	 return obj;
	}
}

public class SingletonExample {
	public static void main(String[] args) {
		SingletonObject.getObject();
		SingletonObject.getObject();
		
	}

}
