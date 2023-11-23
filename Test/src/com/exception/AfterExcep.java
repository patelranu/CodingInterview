package com.exception;
//if exception is thrown and its not catch then control excute final method and left the 
//block it will not execute remaing line of code after final block

public class AfterExcep {
	public static void main(String[] args) {
		try {
			call(10);
			System.out.println("after method call");
			System.out.println("after error  line");

		} catch (Exception e) {
			System.out.println("catch exception ..." + e);
		}
		finally{
			System.out.println("main finally...");
		}
		System.out.println("end of main........");
	}

	private static void call(int a) {
//		try {
//
//			System.out.println("after call  method line");
//			System.out.println(a / 0);
//		}finally {
//			System.out.println("call finally........");
//		}
//		System.out.println("after final remaing line of ........@@@");

		try {

			System.out.println("after call line");
			System.out.println(a / 0);
		} catch (Exception e) {
			System.out.println("call exception handle ..." + e);
		} finally {
			System.out.println("call final........");
		}
		System.out.println("after final remaing line of ........@@@");
	}

}
