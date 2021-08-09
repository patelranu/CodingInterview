package com.basicjava;

//System is a class present in lang package, (System.out.println)
//out is a static variable of PrintStream type,
//println is a method present in PrintStream class

public class WhileLoop {
	public static void main(String[] args) {
		int i=1;
		while(i<5){
			System.out.println(i);
			i++;
		}
		//while
		boolean x=true;
		while(x){
			System.out.println(x);
			x=false;
		}
		
		
		//do-while
		int j=0;
		do{
			System.out.println("hello");
			j++;
		}while(j<=1);
		
			
	}

}
