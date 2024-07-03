package com.TcsPreparation;

import java.util.Scanner;

public class DigitsofNumbers {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int r;
		while (number > 0) {
			r = number % 10;
			number = number / 10;
			System.out.println(r);
		}
		System.out.println(number);
	}

}
