package com.thread;

 class CheckSynch{
	public void check(int val){
	   for(int i=1;i<=3;i++){
			System.out.println(Thread.currentThread()+ ""+i*val);
		}
		
	}
}
class Synch extends Thread{
	CheckSynch obj;
	int val;
	
public Synch(CheckSynch obj,int val) {
	this.obj = obj;
	this.val=val;
	}
  public void run(){
	  synchronized(CheckSynch.class){
		  obj.check(val);
	  }
	  
	  
	  
	}
}

public class Synchro {
	public static void main(String[] args) {
		CheckSynch obj=new CheckSynch();
		CheckSynch obj1=new CheckSynch();
		Synch t1=new Synch(obj,4);
		Synch t2=new Synch(obj1,5);
		t1.start();
		t2.start();
		
	}

}
