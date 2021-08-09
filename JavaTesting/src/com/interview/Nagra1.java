package com.interview;
//t1(odd),t2 1-100 (t2 even)-----
class PrintNumber{
	private  int total_count;
	private static volatile int count=1;
	private int total_thread;
	public PrintNumber(int total_count, int total_thread) {
		this.total_count=total_count;
		this.total_thread=total_thread;
	}
  public void prinitDigit(int num){
	  synchronized(this){
		  while(count<total_count){
			  while(count%total_thread!=num){
				 try {
					this.wait();
				} catch (InterruptedException e){
					e.printStackTrace();
				}
				}
			  if(count!=total_count+1){
				  System.out.println(Thread.currentThread().getName()+" "+count++);
				  this.notifyAll();
			  }
			   
		}
	  }
	  
}
}
class AThread implements Runnable {
	PrintNumber obj;
	int num;
	public AThread(PrintNumber obj,int num) {
		this.obj=obj;
		this.num=num;
	}
	public void run(){
		obj.prinitDigit(num);
	}
}
public class Nagra1 {
	public static void main(String[] args) throws InterruptedException {
	int count=15;
	int total_thread=4;
	PrintNumber obj=new PrintNumber(count,total_thread);
	for(int i=1;i<=total_thread;i++)
		new Thread(new AThread(obj,i%total_thread),"Thread-"+i).start();
		
	}

}
