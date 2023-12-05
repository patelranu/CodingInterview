package com.thread;
//total capacity= assign in queue
//remaing capacity=total capacity-occupied
//remainig capacity means how much value queue can take,
//size=value inside queue
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueMethod{
	public static void main(String[] args) throws InterruptedException   {
		int capacity=2;
		BlockingQueue<Integer> q = new LinkedBlockingQueue<>(capacity);
		q.put(10);
		q.put(20);
		q.put(3);
		
		System.out.println("filled size " +q.size());
		System.out.println("remaingcapacity "+q.remainingCapacity());
		System.out.println("pull "+q.take());  //first
		//q.put(5);
		
		System.out.println(q.size());
		
		System.out.println(q.remainingCapacity());
	}

}
