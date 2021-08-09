package com.thread;
class PrintEvenOdd{
	private int total_thread;
	private int total_count;
    public PrintEvenOdd(int total_thread, int total_count) {
		this.total_thread=total_thread;
		this.total_count=total_count;
	}
	
	public void print(int num){
		synchronized(this){
			  if(num==0){
				  for(int i=2;i<=total_count;i=i+2){
					  System.out.println(Thread.currentThread().getName()+" "+i); 
				  }this.notifyAll();
			  } 
			  if(num!=0){
				  for(int i=1;i<=total_count;i=i+2){
					  System.out.println(Thread.currentThread().getName()+" "+i); 
				  }this.notifyAll();
			  } 
			  
		}
		
	}
}

class ThreadA implements Runnable{
	PrintEvenOdd obj;
	int num;

	public ThreadA(PrintEvenOdd obj,int num) {
		this.obj=obj;
		this.num=num;
	}

	

	@Override
	public void run() {
		obj.print(num);
	}
	
}
public class EvenOdd {
	public static void main(String[] args) {
		int total_thread=2;
		int total_count=10;
		PrintEvenOdd obj=new PrintEvenOdd(total_thread,total_count);
		for(int i=1;i<=total_thread;i++)
			new Thread(new ThreadA(obj,i%total_thread),"thread-"+i).start() ;
	}

}
