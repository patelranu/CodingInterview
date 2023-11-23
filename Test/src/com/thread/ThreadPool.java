package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread extends Thread {
	String message;

	MyThread(String string) {
		this.message = string;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("start thread= "+Thread.currentThread().getName() + message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end thread = "+Thread.currentThread().getName() + message);
	}
}



public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(3);
		for (int task = 1; task <= 5; task++) {
			pool.execute(new MyThread(" message= "+ "task" +task));
		}
		pool.shutdown();

		}
	}
	
	


