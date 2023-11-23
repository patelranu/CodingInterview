package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Produce extends Thread {
	BlockingQueue<String> queue;

	public Produce(BlockingQueue<String> queue) {
		this.queue = queue;
	}
    
	@Override
	public void run() {
		int i = 1;
		try {
			while (i <= 5) {
				queue.put(i+"");
				System.out.println("produce : "+i);
				i++;
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}

class Consume extends Thread {
	BlockingQueue<String> queue;
   
	public Consume(BlockingQueue<String> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		try {
			
			while (true) {
				System.out.println("Consume  : " + queue.take());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
          e.printStackTrace();
		}
	}
}

public class ProducerConsumer {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> num = new ArrayBlockingQueue<>(3);
		Produce p = new Produce(num);
		Consume c = new Consume(num);
		new Thread(p).start();
		new Thread(c).start();

	}

}
