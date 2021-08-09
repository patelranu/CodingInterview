package com.thread;
//main thread after main method...
//child thread start at Thread 0
//sleep, change thread name
//thread scheduler is a part of JVM ,so we can not predict exact output...
//if we call direct run method then no new thread is created..only one thread is available.
class MultiB extends Thread{
	public void run(){
		//Thread.currentThread().setName("thread B");
		System.out.println(Thread.currentThread().getName());
		for(int i =0;i<5;i++){
			try {
				System.out.println("welcome B class");
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class MultiA extends Thread{
	public void run(){
	  //Thread.currentThread().setName("thread A");
	  System.out.println(Thread.currentThread().getName());
		for(int i =0;i<5;i++){
			try {
				System.out.println("welcome A class");
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadImpl {
	public static void main(String[] args) {
	   Thread.currentThread().setName("main thread");
	   System.out.println(Thread.currentThread().getName());
		MultiA obj=new MultiA();
		MultiB objb=new MultiB();
		obj.start(); //thread scheduler register this thread..
		objb.start();
		for(int i=0;i<5;i++){
			try {
				System.out.println("welcome  main method  class");
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
