package com.thread;
//if thread is not in sleeping then it work properly
//if it is sleeping then it throw intrupted exception, and immediately start process


public class IntruptedThread {
	public static void main(String[] args) {
		Thread obj=new Thread(){
			public void run(){
				System.out.println(Thread.currentThread().isInterrupted());
				for(int i=1;i<=10;i++){
					System.out.println("print :" +i);
					try {
						Thread.sleep(0);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(Thread.interrupted()){
					System.out.println(Thread.currentThread().isInterrupted() +".......");
				}
			};
			
		};
		
		 obj.start();
		obj.interrupt();
	}

}
