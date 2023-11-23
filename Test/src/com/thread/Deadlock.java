package com.thread;

//Synch(synch block)
class Resources {
	String x = "ranu";
	String y = "ruby";
}

class AClass extends Thread {
	Resources obj;

	public AClass(Resources obj) {
		this.obj = obj;
	}

	public void run() {
		synchronized (obj.x) {
			System.out.println(Thread.currentThread().getName() +" " + obj.x);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj.y) {
				System.out.println(Thread.currentThread().getName() + obj.y+"....");
			}
		}
	}
}

class BClass extends Thread {
	Resources obj;

	public BClass(Resources obj) {
		this.obj = obj;
	}

	public void run() {
		synchronized (obj.y) {
			System.out.println(Thread.currentThread().getName() +" "+ obj.y);
			synchronized (obj.x) {
				System.out.println(Thread.currentThread().getName() + obj.x+"....");
			}
		}
	}
}

public class Deadlock {
	public static void main(String[] args) {
		Resources obj = new Resources();
		new AClass(obj).start();
		new BClass(obj).start();

	}

}
