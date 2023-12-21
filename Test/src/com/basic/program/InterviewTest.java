package com.basic.program;

public class InterviewTest {

	public static void main(String[] args) {
	  String a="ranu";
	  String b="ranu";
	  System.out.println(a.hashCode());
	  System.out.println(b.hashCode());
	  System.out.println(a==b);
	  a="patel";
	  System.out.println(a.hashCode());
	  System.out.println(b.hashCode());
	  System.out.println(a==b);
	}

}
