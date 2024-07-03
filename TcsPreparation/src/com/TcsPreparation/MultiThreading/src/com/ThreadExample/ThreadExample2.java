package com.ThreadExample;

public class ThreadExample2 implements Runnable {
	public void run() {//Using Runnable Interface
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		ThreadExample2 t2 = new ThreadExample2();
		Thread t1 = new Thread(t2);
		t1.start();
	}

}
