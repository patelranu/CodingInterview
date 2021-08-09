package com.interview;

//The final local variable x cannot be assigned. It must be blank and not using a compound assignment

public class StaticsMethod {
	public static void main(String[] args) {
		int a=5;
		
		Integer x=a;   //boxing
		System.out.println(x);
		int z=x;   //unboxing
		int i=x.intValue();
		Integer v=Integer.valueOf(5);
		
		
	}
}
	//System.out.println(callmethod());
	/*private static int callmethod() {
		 final int x=0;
		    x=x+1;
		return  x;
	}*/


