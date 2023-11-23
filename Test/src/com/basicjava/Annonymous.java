package com.basicjava;
//if we define lambda expression then that interface should be 
//funtional interface
interface Anno{
	int show(int x,int y);
}
public class Annonymous {
	public static void main(String[] args) {
		Anno obj=(int x,int y)->x+y;
		int z=obj.show(6,7);
		System.out.println(z);
	}

}
