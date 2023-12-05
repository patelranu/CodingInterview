package com.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
//asce order ,null not allow ,throw nullpointer exception to put null
//poll it remove form set
public class TreeSets {
	public static void main(String[] args) {
		TreeSet obj=new TreeSet();
		obj.add(10);
		obj.add(1);
		obj.add(12);
		obj.add(6);
		obj.add(20);
		obj.add(15);
		for(Object o:obj){
			System.out.println(o);
		}
		System.out.println(" obj.first() ;;;;;;;;;;;;;;;;;;;;");
		System.out.println(obj.first());
		
		System.out.println("obj.pollFirst() ;;;;;;;;;;;;;;;;;;;;");
		System.out.println(obj.pollFirst());
		System.out.println("after poll first ;;;;;;;;;;;;;;;;;;;;");
		for(Object o:obj){
			System.out.println(o);
		}
		
		System.out.println("obj.pollLast() ;;;;;;;;;;;;;;;;;;;;");
		System.out.println(obj.pollLast());
		System.out.println(obj.tailSet(12,false));
		System.out.println(";;;;;;;;;;;;;;;;;;;;");
		for(Object o:obj){
			System.out.println(o);
			}
		System.out.println(";;;;;;;;;;;;;;;;;;;;");
		for(Object o:obj){
		System.out.println(o);
		}
		List<Integer>i=new ArrayList<>(obj);
		
		Collections.sort(i,new MyComparator());
	}

}
