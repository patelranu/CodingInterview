package com.basicjava;
//

public class BreakContinue {
	//whether class contain main method or not, no compile error
	//error generate by JVM at runtime NOSUCH METHOD ERROR
	//jvm(Software Prog) start excitation from main method so this signature is use 
	//jvm is call main method from any where i.e why is public, static no need obj,
	//main is name of method in jvm which contain para(command lie argu)
	public static void main(String[] args) {
		for(int i=0;i<7;i++){
			if(i==5)
				break;
			System.out.println(i);
		}
		
		for(int i=0;i<7;i++){
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
	

}
