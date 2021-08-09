package com.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Ax{
	static{
		System.out.println("hellovbcvbvb");
	}
	private void m(){
		System.out.println("m");
	}
	private void n(){
		System.out.println("m");
	}
}

public class ForName {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException,  SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		
		try {
			Class obj=Class.forName("com.core.Ax");
			Class obj1=Class.forName("com.core.Ax");
		   Ax ob=   (Ax) obj.newInstance();
		   Method m=obj.getDeclaredMethod("m", null);
		   m.setAccessible(true);
		   m.invoke(ob, null);
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
