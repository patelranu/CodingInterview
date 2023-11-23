package com.thread;
//main thread is not daemon
//child thread we can set as daemon, before call start method.
//if we set child thread as daemon after calling start method then it thrown 
//java.lang.IllegalThreadStateException

class FirstCheck extends Thread{
	public void run(){
		System.out.println("child"+Thread.currentThread().getName());
		System.out.println("child......"+Thread.currentThread().isDaemon());
	}
}

public class DaemonCheck {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isDaemon());
		FirstCheck obj=new FirstCheck();
		//obj.setDaemon(true);
		obj.start();
		System.out.println("main thread...........");
		//System.exit(0);
		
	}

}
