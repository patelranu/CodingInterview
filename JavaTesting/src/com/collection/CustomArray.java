package com.collection;

import java.util.Arrays;
//add, delete, size

public class CustomArray<E> {
	int size;
	Integer[] element;
	int Default_size=5;
	public CustomArray() {
		size=0;
		element=new Integer[Default_size];
	}
	public void add(int value) {
		if(size==Default_size)
			createNewSize();
		element[size++]=value;
	}
	private void createNewSize() {
		int new_size=Default_size*2;
		element=Arrays.copyOf(element, new_size);
	}
	public int size() {
		return size;
		
	}
	public void show() {
		for(int i=0;i<size;i++){
			System.out.println(get(i));
		}
		
	}
	private int get(int index) {
		if(index<size)
		return element[index];
		else 
			throw new  ArrayIndexOutOfBoundsException();
	}
	public void delete(int index) {
		while(index<size-1){
			element[index]=element[index+1];
			index++;
		}
		//element[index]=null;
		size--;
	}   
	

}
