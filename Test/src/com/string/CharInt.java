package com.string;

import java.util.Arrays;
import java.util.List;

public class CharInt {
	public static void main(String[] args) {
		char s[]={'a','b'};
	    String sx=String.valueOf(s); //convert char [] to String
	    System.out.println(sx);
	    char c[]=sx.toCharArray(); //convert String to char []
	    String []st={"a","b"};
	    List<String>ch= Arrays.asList(st); //convert String[] to List
	    String al[]=new String[ch.size()];
	    al=ch.toArray(al);         //convert List to string array
	      
	   
	}
}
