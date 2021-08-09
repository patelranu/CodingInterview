package com.thread;
class Calculation{
	public  synchronized void show(String name){
		System.out.println("welcome to application..."+name);
	}
	public synchronized void getdata(String name){
		System.out.println("hello"+name);
	}
}

public class PractSynch {
	public static void main(String[] args) {
		Calculation obj=new Calculation();
		Calculation obj1=new Calculation();
		Thread ob=new Thread(){
		   public void run(){
			   obj.show(Thread.currentThread().getName());
			   obj.getdata(Thread.currentThread().getName());
		   }
		};ob.start();
		
		Thread ob1=new Thread(){
			   public void run(){
				   obj1.getdata(Thread.currentThread().getName());
				   obj1.show(Thread.currentThread().getName());
		    }
			};ob1.start();
	}

}
