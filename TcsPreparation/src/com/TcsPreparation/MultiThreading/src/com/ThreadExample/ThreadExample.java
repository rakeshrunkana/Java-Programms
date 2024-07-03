package com.ThreadExample;

public class ThreadExample extends Thread {
	public void run() { //Using Thread Class
		System.out.println("Thread is Running...");
	}

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		t1.start();
	}

}
