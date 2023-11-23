package com.java8;

import java.util.Arrays;
import java.util.List;

//Instread of lambdad expression we can use Method reference
//forEach internal Consumer funcational interface- accept method
//filter- Predicate funcational interface method test
class PrintValue{
	public static void displayStatic(String s){
		System.out.println(s);
	}
	
	public void display(String s){
		System.out.println(s);
	}
}

public class MethodReference {
	public static void main(String[] args) {
		PrintValue obj=new PrintValue();
		String a[]={"a","b"};
		List<String>list=Arrays.asList(a);
		list.stream().forEach(i->System.out.println(i));
		System.out.println("==============================");
		list.stream().forEach(System.out::println);
		System.out.println("==============================");
		
		list.stream().forEach(PrintValue ::displayStatic);
		System.out.println("==============================");
		
		list.stream().forEach(obj ::display);
		System.out.println("==============================");
	}

}
