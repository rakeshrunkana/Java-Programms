package com.TcsPreparation;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Program to print fibonacci series");
		System.out.println("Enter number of terms");
		int a = 0;
		int b = 1;
		int c;
		int num = sc.nextInt();
		System.out.println(a + " , " + b);
		for (int i = 0; i < num - 2; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
