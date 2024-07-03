package com.TcsPreparation;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, remainder, sum = 0;
		System.out.println("Enter a number to check armstrong");
		num = sc.nextInt();
		int temp = num;
		while (num > 0) {
			remainder = num % 10;
			sum = sum + remainder * remainder * remainder;
			num = num / 10;
		}
		if (temp ==sum) {
			System.out.println("Armstrong Number " + sum);
		} else {
			System.out.println("Not Armstrong Number " + sum);
		}

	}

}
