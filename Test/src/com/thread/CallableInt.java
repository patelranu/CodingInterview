package com.thread;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class CallableInt {
	public static void main(String[] args) {
		ExecutorService service=Executors.newCachedThreadPool();
		    Future<Integer> f=service.submit(new Callable<Integer>(){

		@Override
			public Integer call() throws Exception {
				System.out.println("start");
				Random random=new Random();
				 int time=random.nextInt(3000);
				 if(time>2000)
					 throw new IOException("time exceed");
				Thread.sleep(time);
				System.out.println("end");
				return time;
			}
			 
		 });
		       service.shutdown();
		       try {
				System.out.println(f.get());
			} catch (InterruptedException | ExecutionException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		
	}

}
