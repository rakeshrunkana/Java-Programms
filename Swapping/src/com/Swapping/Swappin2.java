package com.Swapping;

public class Swappin2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before swapping " + x + " " + y);
		x = x + y;
		y = x - y;// without third variable
		x = x - y;
		System.out.println("After swapping " + x + " " + y);
	}

}
