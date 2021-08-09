package com.exception;

public class Addition {
	public synchronized  void  add(int x){
		System.out.println(Thread.currentThread().getName());
	   for(int i=0;i<x;i++){
			System.out.println("addition ="+i);
		}
	}
		public void sub(){
			System.out.println(Thread.currentThread().getName());
			for(int i=0;i<3;i++){
				System.out.println("substract =" +i);
			}
			
		}
		
	}


