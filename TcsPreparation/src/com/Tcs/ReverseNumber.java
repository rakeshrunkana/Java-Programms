package com.Tcs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter A Number!");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int remainder, reverse = 0;
		while (number > 0) {
			remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("Reverse Number Is " + reverse);
	}

}
