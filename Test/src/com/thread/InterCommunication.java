package com.thread;

class CalSum {
	int total;

//	public void sum() {
//		synchronized (this) {
//			while (!Thread.currentThread().getName().equals("thread-1")) {
//				while (!Thread.currentThread().getName().equals("thread-2")) {
//					try {
//						wait();
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println(Thread.currentThread().getName() + " total sum:" + total);
//				}
//				System.out.println(Thread.currentThread().getName() + " adding more 5");
//				this.notify();
//
//				try {
//					wait();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			System.out.println(Thread.currentThread().getName() + "start calculating....");
//			for (int i = 1; i <= 5; i++) {
//				total = total + i;
//			}this.notify();
//
//		}
//
//	}
	
	public  void sum(){
		synchronized(this){
			System.out.println(Thread.currentThread().getName());
			if(!Thread.currentThread().getName().equals("thread-0")){
				System.out.println(Thread.currentThread().getName() +"@@@");
				for (int i = 1; i <= 5; i++) {
				  total = total + i;
				}
				this.notify();
			}
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " total sum:" + total);
		}

		}
		
}

class InterClass extends Thread {
	CalSum obj;

	public InterClass(CalSum obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.sum();
	}

}

public class InterCommunication {
	public static void main(String[] args) {
		int thread_count = 3;
		CalSum obj = new CalSum();
		for (int i = 1; i <=thread_count; i++) {
			new InterClass(obj).start();
		}

	}

}
