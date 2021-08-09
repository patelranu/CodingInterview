package com.thread;
 class Valate{
	 volatile int value=0;
	 
	 public void getOld(){
		 System.out.println(Thread.currentThread().getName() +" "+value);
	
	 }
	 public void after(){
		 System.out.println(Thread.currentThread().getName() +" "+(++value));
	 }
	
}
class ABC extends Thread{
	final Valate obj;
	
	public ABC(Valate obj) {
		this.obj = obj;
	}

	public void run(){
		obj.getOld();
		obj.after();
	}
}

public class BasicImportant {
	public static void main(String[] args) throws InterruptedException {
		Valate ob=new Valate();
		ABC obj[]=new ABC[2];
		for(int i=0;i<2;i++)
		 obj[i]=new ABC(ob);
		for(int i=0;i<2;i++)
			obj[i].start();
		for(int i=0;i<2;i++)
			obj[i].join();
	}
	
	
	//if we start 2 time start method..
	//t.start();
	//t.start();     illegalthreadException..

}
