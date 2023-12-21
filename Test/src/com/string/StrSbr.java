package com.string;

public class StrSbr {
	public static void main(String[] args) {
		String s="ranu";
		String s1=new String("ranu");
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println("to check requal s1 and s...."+ s1==s);
		
		System.out.println("buffered.....................");
		StringBuffer br1=new StringBuffer("ranu");
		StringBuffer br2=new StringBuffer("ranu");
		System.out.println(br1.hashCode());
		System.out.println(br2.hashCode());
		System.out.println(br1.equals(br2));
		System.out.println("builder.....................");
	    StringBuilder br3=new StringBuilder("ranu");
		StringBuffer br4=new StringBuffer("ranu");
		System.out.println(br3.hashCode());
		System.out.println(br4.hashCode());
		System.out.println("..................................");
		System.out.println(br3.equals(br4));
	    System.out.println(".........................");
		
	}

}
