package com.thread;
class PrintEvenOdd{
	private int total_thread;
	private int total_count;
    public PrintEvenOdd(int total_thread, int total_count) {
		this.total_thread=total_thread;
		this.total_count=total_count;
	}
	
	public void print(int threadNumber){
		synchronized(this){
			  if(threadNumber%2==0){
				  for(int i=2;i<=total_count;i=i+2){
					  System.out.println(Thread.currentThread().getName()+" "+i); 
				  }
			  } 
			  if(threadNumber%2!=0){
				  for(int i=1;i<=total_count;i=i+2){
					  System.out.println(Thread.currentThread().getName()+" "+i); 
				  }
			  } 
			  
		}
		
	}
}

class ThreadA extends Thread{
	PrintEvenOdd obj;
	int threadNumber;

	public ThreadA(PrintEvenOdd obj,int threadNumber) {
		this.obj=obj;
		this.threadNumber=threadNumber;
	}

	

	@Override
	public void run() {
		obj.print(threadNumber);
	}
	
}
public class EvenOdd {
	public static void main(String[] args) {
		int total_thread=2;
		int total_count=10;
		PrintEvenOdd obj=new PrintEvenOdd(total_thread,total_count);
		for(int i=1;i<=total_thread;i++)
			new ThreadA(obj,i).start() ;
	}

}
