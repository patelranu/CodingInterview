package com.thread;

//join -give a chance to child thread..
//yield method gives hint to the thread scheduler that it is ready to pause its execution.
//The thread scheduler is free to ignore this hint.
//yeild- stop for running current thread.
class YeildJoinClass extends Thread {
   public void run() {
	   Thread.currentThread().setPriority(10);
	    for (int i = 0; i < 3; i++) {
		    Thread.yield();
		    System.out.println(i);
	   }
}
}

public class YeildJoinSleep2 {
	public static void main(String[] args) throws InterruptedException{
		Thread.currentThread().setPriority(1);
		YeildJoinClass obj = new YeildJoinClass();
		obj.start();
	    for (int i = 0; i < 3; i++) {
			Thread.sleep(100);
			System.out.println("main value :" + i);
		}

	}

}
