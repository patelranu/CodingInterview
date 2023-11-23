package com.thread;

class MultiplicationThread extends Thread {
	Operation obj;
	int val;

	public MultiplicationThread(Operation obj, int val) {
		this.obj = obj;
		this.val = val;
	}

	public void run() {
		synchronized (Operation.class) {
			System.out.println(Thread.currentThread().getName());
			obj.multiplication(val);
		}
	}
}

public class SynchronizationMain {
	public static void main(String[] args) {
		Operation obj = new Operation();
		Operation obj1 = new Operation();
		MultiplicationThread t1 = new MultiplicationThread(obj, 4);
		MultiplicationThread t2 = new MultiplicationThread(obj, 5);
		t1.start();
		t2.start();

	}

}
