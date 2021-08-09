package com.thread;
//remaing capacity=totalsize-totalvalue inside queue
//size=value inside queue
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PC{
	public static void main(String[] args) throws InterruptedException   {
		int capacity=3;
		BlockingQueue<Integer> q = new ArrayBlockingQueue<>(capacity);
		q.put(10);
		q.put(20);
		q.put(3);
		System.out.println(q.take());  //first
		//q.put(5);
		
		System.out.println(q.size());
		
		System.out.println(q.remainingCapacity());
	}

}
