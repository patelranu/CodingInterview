package com.sorting;
//create hole..........
public class Insertion {
	public static void main(String[] args) {
		int a[]={4,3,2,10,12,1,5,6};
		for(int i=1;i<a.length;i++){
			int temp=a[i];
			int hole=i;
			while(hole>0 && a[hole-1]>temp){
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=temp;
		}
		for(int x:a){
			System.out.println(x);
		}
	}

}
