package com.java8;

import java.util.Optional;
//null check then ofNullable, 
//strig is empty or not then of
//orelse throw exception
public class OptionalClass {
  public static void main(String[] args) {
	String s=null;
		Optional<String>x=Optional.ofNullable(s);
		String st=Optional.ofNullable(s).orElse("ranupatel");
		String value=Optional.ofNullable(s).orElseThrow(IllegalArgumentException::new);
		if(value.isEmpty()){
			System.out.println(s.length());
		}else{
			System.out.println("error");
		}
}
}
