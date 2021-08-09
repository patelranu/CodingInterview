package com.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class Produce implements Runnable {
	BlockingQueue<String> queue;
	public Produce(BlockingQueue<String> queue) {
		this.queue=queue;
	}
       @Override
	public void run() {
    	   int i=1;
    	try{
			while(i<=5){
				  queue.put(i+"");
				  System.out.println("Produce "+i);
				  i++;
				  Thread.sleep(10000);
				}	
				
		}catch(Exception e){
			e.getStackTrace();
		}
	}

}
class Consume implements Runnable {
	BlockingQueue<String> queue;
	public Consume(BlockingQueue<String> queue) {
		this.queue=queue;
	}
	@Override
	public void run() {
		//System.out.println("Consume");
		 try {
				while(true){
					 System.out.println("Consume" +queue.take());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}



public class ProducerConsumer {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<String> num = new ArrayBlockingQueue<>(3);
		Produce p=new Produce(num);
		Consume c=new Consume(num);
		new Thread(p).start();
	    new Thread(c).start();
		
		
		
		
	
	}
	
}
