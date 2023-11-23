package com.thread;

//runnable interface only one method-run
//if we not implemt run method then main thread run method, is called and this method is empty implementation..
class RunnableClass implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" runable child");
		System.out.println("runnable implementation");

	}
}

class ThreadClass extends Thread {
    public void run(){
    	System.out.println(Thread.currentThread().getName()+" thread child");
    	System.out.println("thread implementation");
    }
}

public class RunableImpl {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getName());
		RunnableClass obj =new RunnableClass() ;
		 new Thread(obj).start();
         
        ThreadClass obj1 = new ThreadClass();
        obj1.start();
	}

}
