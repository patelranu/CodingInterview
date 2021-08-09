package com.exception;
class Show extends RuntimeException{
	String x;
	Show(String x){
		this.x=x;
		try{
			error2();
		}catch(Exception e){
			System.out.println("hi");
		}
		
	}
	private void error2() {
		try{
			int a=10/0;
		}finally{
			System.out.println("fdgdf");
		}
		
	}
	
}

public class Exception2 {
	public static void main(String[] args) {
		int a=10;
		if(a>7)
			throw new Show("grater");
	}

}
