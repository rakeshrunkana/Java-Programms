package com.ThreadExample;

public class ThreadSleepMethod extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			// The thread will sleep for the 500 milli seconds
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
				System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		ThreadSleepMethod t1 = new ThreadSleepMethod();
		ThreadSleepMethod t2 = new ThreadSleepMethod();
		t1.start();
		t2.start();
	}

}
