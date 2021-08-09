package com.exception;

public class ExceptionHandle1 {
	public static void main(String[] args) {
		try{
			errorMethod();
			System.out.println("welcome to after error method...");
		}catch(	Exception e){
			System.out.println("main catch block...");
		}finally{
			System.out.println("main finally block");
		}
	}

	private static void errorMethod() {
		try{
			int a=10/0;
		}/*catch(RuntimeException e){
			System.out.println("inside error method....");
		}*/finally{
			System.out.println("end of error method....");
		}
		
	}

}
