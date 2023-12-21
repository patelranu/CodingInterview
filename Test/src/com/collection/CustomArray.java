package com.collection;

import java.util.Arrays;
//add, delete, size

public class CustomArray<E> {
	int size;
	Integer[] array;
	int Default_size=5;
	public CustomArray() {
		size=0;
		array=new Integer[Default_size];
	}
	public void add(int value) {
		if(size==Default_size)
			createNewSize();
		array[size++]=value;
	}
	private void createNewSize() {
		int new_size=(Default_size*3/2)+1;
		array=Arrays.copyOf(array, new_size);
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
		return array[index];
		else 
			throw new  ArrayIndexOutOfBoundsException();
	}
	public void delete(int index) {
		while(index<size-1){
			array[index]=array[index+1];
			index++;
		}
		//element[index]=null;
		size--;
	}   
	

}
