package com.designpattern;
//volatile we can use
public class SingletonObject {

	private volatile static SingletonObject obj; // static and private

	private SingletonObject() {
		System.out.println("constructor call");

	}

	// duble check
	public static SingletonObject getInt() {
		if (obj == null) {
			synchronized (SingletonObject.class) {
				if (obj == null) {
					obj = new SingletonObject();

				}
			}

		}
		return obj;
	}

}
