package com.array;

public class PairSum {
	public static void main(String[] args) {
		int a[]={4, 6, 5, -10, 8, 5, 20,5};
		int sum=10;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==sum){
					System.out.println("pair: " + a[i]+" "+a[j]);
				}
			}
		}
	}

}
