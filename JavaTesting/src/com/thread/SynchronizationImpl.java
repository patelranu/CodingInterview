package com.thread;

class Multiplication{
	public  void matrix(int x) {
		System.out.println("ssdsj......"+Thread.currentThread().getName());
		synchronized(this){
			System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++){
			try {
				System.out.println(x*i);
				Thread.sleep(10);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}
	}
	public void displaydata(){
		System.out.println(Thread.currentThread().getName()+"...............");
	}
}

class MultiF extends Thread{
	Multiplication object;
	int val;
    public MultiF(int val, Multiplication obj) {
    	object=obj;
    	this.val=val;
    }
    public void run(){
    	object.matrix(val);
    	object.displaydata();   	
    }
	
}

public class SynchronizationImpl {
	public static void main(String[] args) {
		Multiplication obj=new Multiplication();
	    MultiF ob1=new MultiF(5,obj);
		MultiF ob2=new MultiF(2,obj);
		ob1.start();
		ob2.start();
	}

}
