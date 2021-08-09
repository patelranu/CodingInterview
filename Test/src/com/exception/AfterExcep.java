package com.exception;
public class AfterExcep {
	public static void main(String[] args) {
		 try{
			 call(10);
			System.out.println("after method call");
			System.out.println("after error  line");
			 
		 }catch(Exception e){
			 System.out.println("catch exception"+e);
		 }
		 System.out.println("........");
	}private static void call(int a) {
		try{
			System.out.println(a/0);
			System.out.println("after call line");
		}catch(Exception e){
			System.out.println("call exception handle"+e);
		}
		finally{
			System.out.println("call final");
		}
		System.out.println("........@@@");
	}

}
