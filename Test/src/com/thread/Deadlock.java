package com.thread;
//Synch(synch block)
class A{
	String x="ranu";
	String y="ruby";
}
class C extends Thread{
	A obj;
	public C(A obj) {
		this.obj=obj;
	}
    public void run(){
    	synchronized(obj.y){
		try {
			System.out.println(Thread.currentThread().getName() + obj.y+"%%%");
		     Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	synchronized(obj.x){
			System.out.println(Thread.currentThread().getName() + obj.x);
        }
}
}
}
class B extends Thread{
	A obj;
	public B(A obj) {
		this.obj=obj;
	}
    public void run(){
    	synchronized(obj.x){
    		System.out.println(Thread.currentThread().getName() + obj.x+"@@");
    		synchronized(obj.y){
    			System.out.println(Thread.currentThread().getName() + obj.y+"&&&");
    		   }
            }
}
}

public class Deadlock {
	public static void main(String[] args) {
		A obj=new A();
		new C(obj).start();
		new B(obj).start();
	   
	
		
	}

}
