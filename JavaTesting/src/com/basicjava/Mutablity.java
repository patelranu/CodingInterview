package com.basicjava;
//final class, final variable , getter, constructor

final class Mute{
	private final int x;
	public Mute(int x){
		this.x=x;
	}
	public int getX() {
		return x;
	}
	
}

public class Mutablity {
	public static void main(String[] args) {
		Mute obj=new Mute(7);
		System.out.println(obj.getX());
	}
}
