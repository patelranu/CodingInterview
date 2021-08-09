package com.exception;

import java.io.IOException;
//Since the checked exceptions are checked at the compile time, 
//compiler can determine whether any given exception can be thrown by the code or not.
//Here, the code tries to catch an IOException 
//but it is not being thrown by the code in the try block.
//Hence it will give compilation error “Unreachable catch block for IOException. 
//This exception is never thrown from the try statement body”.
public class Test2 {
	public static void main(String[] args) {
try{
			
			Test2 t = new Test2();
			t.doNothing();
			System.out.println("I have done nothing");
			
		}catch(IOException e){
			System.out.println("Exception1");
		}
	}
	
	private void doNothing(){
		for(int i = 0 ; i < 10; i++){
		}
	}
	}

