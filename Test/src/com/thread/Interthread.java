package com.thread;
//when we create obj of class, then thread-0 is create and its
//call class using start method.
//In Interthread, provide lock for method and object also
class Sum{
	int add=0;
	public synchronized void sum(){
		System.out.println("sum of all :");
	for(int i=1;i<=10;i++){
		add=i+add;
		//Thread.sleep(1000);
	   }this.notify();
	}
}
class InterthreadClass extends Thread{
	Sum obj;
	
	public InterthreadClass(Sum obj) {
	   this.obj = obj;
	}

	public void run(){
		obj.sum();
		
	}
	
}

public class Interthread {
	public static void main(String[] args) throws InterruptedException{
		Sum object=new Sum();
		InterthreadClass obj=new InterthreadClass(object);
		Thread obj1=new Thread(){
			public void run(){
				System.out.println("sum ="+object.add);
			}
		};
		obj.start();
	 synchronized(obj){
			obj.wait();
		}
	 
		obj1.start();
		
	}
}
