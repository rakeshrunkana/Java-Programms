package com.Tcs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number!");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int factorcount = 0;
		int loopcounter=0;
		for (int i = 2; i < Math.sqrt(number); i++) {
			if (number % i == 0) {
				factorcount++;
			}
			loopcounter++;
			System.out.println(loopcounter);
			System.out.println("Iteration count"+i);

		}
		if (factorcount == 0) {
			System.out.println("Entered number is prime");
		} else {
			System.out.println("Entered number is not prime");
		}
	}

}
