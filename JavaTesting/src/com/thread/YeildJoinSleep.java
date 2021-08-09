package com.thread;
//join -give a chance to child thread..
//yeild- stop for running current thread.
class MultiE extends Thread{
	static volatile int  count=0;
	public void run(){
		for(int i=0;i<5;i++){
			count=count +i;
		}
	}
	
}


public class YeildJoinSleep {
	public static void main(String[] args) throws InterruptedException {
		MultiE obj1=new MultiE();
		MultiE obj2=new MultiE();
		MultiE obj3=new MultiE();
		obj1.start();
		obj1.join();
		obj2.start();
		obj2.join();
		obj3.start();
		obj3.join();
		System.out.println(obj2.count+"...................");
	}

}
