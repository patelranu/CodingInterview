package com.basicjava;
class BooleanInt{
	public static int toInteger(boolean val){
		
		return val?1:0;
		
	}
	
}

public class SwitchBool {
	public static void main(String[] args) {
		boolean x=false;
		switch(BooleanInt.toInteger(x)){
		case 1:
			System.out.println("yeas true");
		case 0:
			System.out.println("false");
		}
	}
}
