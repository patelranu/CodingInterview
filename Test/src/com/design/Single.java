package com.design;
class SA extends Thread{
  public void run(){
	  System.out.println(Thread.currentThread().getName());
	  Singleton.getInt();
	}
}	
class SB extends Thread{
 public void run(){
	 System.out.println(Thread.currentThread().getName());
	 Singleton.getInt();
	
   }
	
}
class Singleton{
	private static Singleton obj; //static and private
	private Singleton(){
		System.out.println("hello");
		
	}
public  static Singleton getInt(){
	synchronized(Singleton.class){
		 if(obj==null){
				obj=new Singleton();
			}
			return obj;
		}
	}
	 
}

public class Single {
	public static void main(String[] args) {
		SA obj=new SA();
		SB obj1=new SB();
		 obj.start();
		 obj1.start();
	}
}
