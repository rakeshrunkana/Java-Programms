package com.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Program to print FibonacciSeries ");
		System.out.println("Enter Number Of Terms");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.println(a + "," + b);
		for (int i = 0; i < number - 2; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;

		}
	}

}
