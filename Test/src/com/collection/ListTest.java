package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
//add,addAll(ListObject).addAll(index,Object)
//remove(index),removeAll(ListObject),clear
//removeif
//set get- set and add both are same

public class ListTest {
	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<>();
		list.add(1);
        list.add(2);
		list.add(5);
		list.add(7);
		list.add(9);
		list.set(1, 100);
		list.removeIf(value->value.equals(7));
		list.add(1, 10);
		//list.remove(0);
		ArrayList<Integer>l2=new ArrayList<>();
		l2.add(20);
		l2.add(10);
		//list.addAll(l2);
		//list.addAll(1, l2);
		list.removeAll(l2);
		//list.clear();
	Iterator<Integer> it=list.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	System.out.println("Lamda expression.........");
	//list.forEach(i->System.out.println(i));
		
		
	}

}
