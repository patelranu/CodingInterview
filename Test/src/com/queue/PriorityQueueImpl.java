package com.queue;

import java.util.PriorityQueue;

//ascs order print, FIFO
//poll and remove both are same(removed)
//peek and element both are same(only element show)
public class PriorityQueueImpl {
	public static void main(String[] args) {
		PriorityQueue que=new PriorityQueue();
		que.add("ranu");
		que.add("rash");
		que.add("aaa");
		que.add("preet");
		for(Object q:que)
			System.out.println(q);
		
		
		System.out.println("peek...."+que.peek());
		System.out.println("elemt...."+que.element());
		System.out.println("pool...."+que.poll());
		for(Object q:que)
			System.out.println(q);
		System.out.println("remove..."+que.remove());
		for(Object q:que)
			System.out.println(q);
	
		
	}
    
}
