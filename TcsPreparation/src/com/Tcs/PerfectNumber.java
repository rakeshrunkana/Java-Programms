package com.Tcs;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == number) {
			System.out.println(number + " Is a perfect number ");
		} else {
			System.out.println(number + " Is not a perfect number ");
		}
	}

}
