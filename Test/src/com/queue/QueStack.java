package com.queue;

import java.util.Stack;

class StackQueue{
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	public void enQueue(int val) {
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		s1.push(val);
		
		
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
	}
	
	public void deQueue() {
		if(s1.isEmpty()){
			System.out.println("stack is empty..........");
			System.exit(0);
		}else{
			System.out.println("pop value............");
			System.out.println(s1.pop());
		}
		
	}
	public void display() {
		System.out.println(s1.size() +"display result...........");
	 for(int i=s1.size()-1;i>=0;i--){
		System.out.println(s1.get(i));	
	 }
	  
  }
}
public class QueStack {
	public static void main(String[] args) {
		StackQueue obj=new StackQueue();
		obj.enQueue(10);
		obj.enQueue(20);
		obj.enQueue(30);
		obj.enQueue(40);
		obj.display();
		//obj.deQueue();
		//obj.display();
	}

}
