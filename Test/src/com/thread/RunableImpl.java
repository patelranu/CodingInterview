package com.thread;
//runnable interface only one method-run
//if we not implemt run method then main thread run method, is called and this method is empty implementation..
class MultiD extends Thread{
	int i=5;
	{
		System.out.println(i);
	}
	
}
class MultiC implements Runnable {
    @Override
	public void run() {
    	
    	System.out.println("welcome C");
	
   }
}

public class RunableImpl {
public static void main(String[] args) {
	MultiC ob=new MultiC();
	
	MultiD object=new MultiD();
	object.start();
	Thread obj=new Thread(ob);
	obj.setPriority(10);
	obj.start();
	
	
		//Thread.sleep(1);
		System.out.println("welcome main");
	 /*catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	
}

}
