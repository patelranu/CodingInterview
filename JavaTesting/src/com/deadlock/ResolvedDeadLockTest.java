package com.deadlock;

public class ResolvedDeadLockTest {
	
	public static void main(String[] args) {
		
		final A a = new A();
        final B b = new B();
        // Thread-1
        Runnable block1 = new Runnable() {
            public void run() {
                synchronized (a) {
                    // Adding delay so that both threads can start trying to
					// lock resources
					System.out.println("synchronized  block 1 ");
				   
                    // Thread-1 have A but need B also
                    synchronized (b) {
                        System.out.println("In block 1");
                    }
                }
            }
        };
        Runnable block2 = new Runnable() {
            public void run() {
                synchronized (b) {
                	System.out.println("synchronized block 2 ");
                    // Thread-2 have B but need A also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };
 
        new Thread(block1).start();
        new Thread(block2).start();
    }
	
	}

