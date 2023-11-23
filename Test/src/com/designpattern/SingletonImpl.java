package com.designpattern;

class SA extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		SingletonObject.getInt();
	}
}

class SB extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		SingletonObject.getInt();

	}

}

public class SingletonImpl {
	public static void main(String[] args) {
		SA obj = new SA();
		SB obj1 = new SB();
		obj.start();
		obj1.start();
		
	}
}
