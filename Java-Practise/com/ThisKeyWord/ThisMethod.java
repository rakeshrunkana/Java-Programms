package com.ThisKeyWord;

public class ThisMethod {
	void m() {
		System.out.println("hello m ");
	}

	void n() {
		System.out.println("hello n");
		this.m();
	}

	public static void main(String[] args) {
		ThisMethod tm = new ThisMethod();
		tm.n();
	}

}
