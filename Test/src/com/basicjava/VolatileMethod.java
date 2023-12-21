package com.basicjava;

//volatile variable shared main memory area so immedate it reflect the changes on variable
//static variable take copy of variable and work it take time to reflect the changes on variable.
class AThread extends Thread {

	 public static boolean run=true;
	//private volatile boolean run = true;

	public void run() {
		for (int i = 0; i < 10; i++) {
			while (run) {
                System.out.println("print ranu");
				try {
					Thread.sleep(40);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	public void shutdown() {
		System.out.println("shutdown........");
		run = false;

	}

}

public class VolatileMethod {
	public static void main(String[] args) throws InterruptedException {
		AThread obj = new AThread();
		obj.start();
		Thread.sleep(50);
		obj.shutdown();
	}

}
