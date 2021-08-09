package com.exception;
class Sum{
	int add=0;
	public void sum(){
	for(int i=1;i<=5;i++){
		add=i+add;
	}
	}
}
class CheckInter extends Thread{
	Sum obj;
	
	public CheckInter(Sum obj) {
	   this.obj = obj;
	}

	public void run(){
		obj.sum();
	}
	
}

public class Interthread {
	public static void main(String[] args) throws InterruptedException {
		Sum object=new Sum();
		CheckInter obj=new CheckInter(object);
		obj.start();
		synchronized(obj){
			obj.wait();
		}
		
		System.out.println("sum is"+object.add);
	}

}
