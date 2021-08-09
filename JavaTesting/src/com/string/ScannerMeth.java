package com.string;

import java.util.Scanner;

public class ScannerMeth {
	public static void main(String[] args) {
		System.out.println("enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("enter name");
		String z=sc.next();
		System.out.print(z);
		
		//int x=sc.nextInt();
		//System.out.println(x);
	}

}
