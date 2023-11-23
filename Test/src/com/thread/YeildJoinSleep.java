package com.thread;

//join -give a chance to child thread..
//yeild- stop for running current thread.
class YeildJoinClass extends Thread {
   public void run() {
	    for (int i = 0; i < 5; i++) {
		    Thread.yield();
		    System.out.println(i);
	   }
}
}

public class YeildJoinSleep {
	public static void main(String[] args){
		YeildJoinClass obj = new YeildJoinClass();
		obj.start();
	    for (int i = 0; i < 5; i++) {
			//Thread.sleep(1000);
			System.out.println("value :" + i);
		}

	}

}
