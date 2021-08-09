package com.collection;

public class ArrayList {
	public static void main(String[] args) {
		CustomArray<Integer>obj=new CustomArray<>();
		obj.add(10);
		obj.add(20);
		obj.add(5);
		obj.add(23);
		obj.add(7);
		obj.add(12);
		obj.add(18);
		obj.add(new Integer(1));
		
		System.out.println(obj.size()+".................");
		obj.show();
		obj.delete(6);
		System.out.println("delete.................");
		obj.show();
		System.out.println(obj.size()+".................");
		
	}

}
