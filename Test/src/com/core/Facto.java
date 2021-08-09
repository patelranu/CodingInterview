package com.core;

import java.util.Scanner;

public class Facto{
	public static void main(String[] args) {
		System.out.println("enter number :");
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int result=factorial(val);
		System.out.println(result);
	}

	private  static int  factorial(int n){
		if(n==1 || n==0)
			return 1;
		else 
			return n*factorial(n-1);
			
	
	}

}
