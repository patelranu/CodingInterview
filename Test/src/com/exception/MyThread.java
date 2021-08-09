package com.exception;

 class MyThreading extends Thread{
	 Addition object;
	public MyThreading(Addition object) {
		this.object=object;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName());
		object.add(5);
		object.sub();
	}
}





public class MyThread {
	public static void main(String[] args) {
		Addition object=new Addition();
		MyThreading ob1=new MyThreading(object);
		Thread.currentThread().setName("one thread");
		MyThreading ob2=new MyThreading(object);
		Thread.currentThread().setName("two thread");
		ob1.start();
		ob2.start();
	}
}
