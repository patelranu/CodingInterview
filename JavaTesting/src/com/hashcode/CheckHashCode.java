package com.hashcode;

public class CheckHashCode {
	public static void main(String[] args) {
		String a="ranu patel";
		String c="ranu";
		String b=new String("patel ranu");
		String d=b+" patel";
		String e="ranu patel";
		System.out.println(a==e);
		System.out.println(a.equals(e));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(a.equals(b)+".............");
		System.out.println(a.equals(c));
		System.out.println(a==c);
		System.out.println(a==b);
		
		}

}
