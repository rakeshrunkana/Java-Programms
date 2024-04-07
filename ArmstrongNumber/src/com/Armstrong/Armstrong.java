package com.Armstrong;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remainder, sum = 0;
		int temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = sum + remainder * remainder * remainder;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println("Armstrong Number " + sum);
		} else {
			System.out.println("Not a armstrong number " + sum);
		}
		
	}

}
