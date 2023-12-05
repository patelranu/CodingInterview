package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class CollectionTest {
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		list.add(0, "ranu");
		list.addFirst("ranu patel");
		list.addLast("patel");
		
		ListIterator <String> itr=list.listIterator();
		while(itr.hasNext()){
			 System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
		}
		

//		for(String a:list){
//			System.out.println(a);
//		}
//		
//		System.out.println("..........");
//		System.out.println(list.element());
//		
//		System.out.println(list.lastIndexOf("patel"));
//		System.out.println(list.offer("xxxx"));
//		System.out.println("..........");
//		for(String a:list){
//			System.out.println(a);
//		}
//		System.out.println(list.offerFirst("yyyy"));
//		System.out.println(list.offerLast("zzzzz"));
//		
//		System.out.println("..........");
//		for(String a:list){
//			System.out.println(a);
//		}
//		System.out.println("..........");
//		System.out.println(list.peek());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<String> list=new ArrayList<>();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		list.add(new String("a"));
//		list.add(0, "ranu");
//		list.set(0, "ranurash");
//		//list.clear();
//		
//		for(String a:list){
//			System.out.println(a);
//		}
//		System.out.println("...............");
//		System.out.println(list.get(0));
//		
//		System.out.println(list.contains("a"));
//		System.out.println(list.lastIndexOf("d"));
		
		
		
		
		
	}

}
