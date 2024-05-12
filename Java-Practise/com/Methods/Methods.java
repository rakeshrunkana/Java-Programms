package com.Methods;

import java.util.Scanner;

public class Methods {
	static void findEvenOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("Entered Number is Even " + n);
		} else {
			System.out.println("Entered Number is Odd " + n);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to check even or odd ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findEvenOdd(n);

	}

}
