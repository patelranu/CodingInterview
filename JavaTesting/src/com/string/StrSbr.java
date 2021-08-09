package com.string;

public class StrSbr {
	public static void main(String[] args) {
		String s="ranu";
		System.out.println(s.hashCode());
		System.out.println(".......................");
		String s1=new String("ranu");
		System.out.println(s1.hashCode());
		System.out.println(".......................");
		StringBuffer br1=new StringBuffer("ranu");
		StringBuffer br2=new StringBuffer("ranu");
		System.out.println(br1.hashCode());
		System.out.println(br2.hashCode());
		System.out.println("..................................");
		System.out.println(br1.equals(br2));
	    System.out.println(".........................");
		
	}

}
