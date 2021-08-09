package com.exception;

 class CheckSynch{
	public void check(){
		for(int i=0;i<3;i++){
			System.out.println(Thread.currentThread()+ ""+i);
		}
	}
}
class Synch extends Thread{
	CheckSynch obj;
	
public Synch(CheckSynch obj) {
	this.obj = obj;
	}
  public void run(){
	  obj.check();
	}
}

public class Synchro {
	public static void main(String[] args) {
		CheckSynch obj=new CheckSynch();
		Synch t1=new Synch(obj);
		Synch t2=new Synch(obj);
		t1.start();
		t2.start();
		
		
		
		
		
	}

}
