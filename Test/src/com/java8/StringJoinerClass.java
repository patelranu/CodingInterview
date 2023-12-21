package com.java8;

import java.util.StringJoiner;

public class StringJoinerClass {
	public static void main(String[] args) {
		StringJoiner joinNames = new StringJoiner(",", "[" ,"]"); ;
		joinNames.add("Rahul");
		joinNames.add("Rash");
		System.out.println(joinNames);
	}

}
