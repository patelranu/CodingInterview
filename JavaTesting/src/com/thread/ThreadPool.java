package com.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class MyThread implements Runnable{
	int i;
	MyThread(int i){
		this.i=i;
	}
	public void  run(){
		System.out.println("start   "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end   "+i);
	}
}

class X implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		System.out.println("start");
		Random random=new Random();
		 int time=random.nextInt(3000);
		Thread.sleep(time);
		return time;
	}
	
}

public class ThreadPool {
	public static void main(String[] args) {
		ExecutorService pool= Executors.newFixedThreadPool(2);
		   for(int i=1;i<=5;i++){
			   pool.execute(new Thread(new MyThread(i)));
		   }
		   pool.shutdown();
	}
	
}
