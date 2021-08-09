package com.designprogram;

public class CharConvert {
	public static void main(String[] args) {
		int x=65;
		int n=5;
		for(int i=1;i<=n;i++){
			for(int j=1; j<=n-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
				System.out.print(k+" ");
			
			System.out.println("\n");
		}
		
		
	}

}
