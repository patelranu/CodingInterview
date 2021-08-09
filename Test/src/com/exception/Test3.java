package com.exception;

public class Test3 extends Exception {

	public Test3(){}
	public Test3(String str){
		super(str);
	}
	
	int importantData = 5;
	public static void main(String[] args) {
		Test3 t = new Test3();
		try{
			t.importantMethod();
		}catch(Exception e){
			System.out.println(e+"........");
		}
		
	}
	private void importantMethod() {
		int a=10;
		if( 10 > 5)
			throw new Test3("Important data is invalid");
			 
		else
			System.out.println("vcbcv");
		
	}
	
	
}
