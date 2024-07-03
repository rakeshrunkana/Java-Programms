package com.TcsPreparation;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int factorCount = 0;
		int loopCounter = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				factorCount++;
			}
			loopCounter++;
			System.out.println(loopCounter);
			System.out.println("iteration count " + i);
		}
		if (factorCount == 0) {
			System.out.println("enterd number is prime");
		} else {
			System.out.println("entered number is not prime");
		}
	}
}
