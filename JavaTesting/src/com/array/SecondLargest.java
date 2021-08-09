package com.array;

public class SecondLargest {
	public static void main(String[] args) {
		int a[]={47498, 14526, 74562, 42681, 75283, 45796};
		int first=a[0];
		int second=a[1];
		for(int i=1;i<a.length;i++){
			if(a[i]>first){  //16>47
				second=first;
				first=a[i];
			}
		}
		System.out.println(second);
	}

}
