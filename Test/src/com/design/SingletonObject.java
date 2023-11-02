package com.design;

public class SingletonObject {

	private static SingletonObject obj; // static and private

	private SingletonObject() {
		System.out.println("hello");

	}

	public static SingletonObject getInt() {
		synchronized (SingletonObject.class) {
			if (obj == null) {
				obj = new SingletonObject();
			}
			return obj;
		}
	}

}
