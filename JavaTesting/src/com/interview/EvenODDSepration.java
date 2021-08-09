package com.interview;

public class EvenODDSepration {
	public static void main(String[] args) {
		int a[]={1,6,4,9,2,8,3,0,5,5,1,0};
		int b[]=new int[a.length];
		 int odd=0,even=a.length-1;
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				b[odd]=a[i];
				odd++;
			}else{
				b[even]=a[i];
				even--;
			}
		}
		for(int x:b){
			System.out.println(x);
		}
	}

}
