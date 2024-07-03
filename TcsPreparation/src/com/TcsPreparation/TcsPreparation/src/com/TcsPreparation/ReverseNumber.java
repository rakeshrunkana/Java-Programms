package com.TcsPreparation;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num, remainder, reverse = 0;
		num = sc.nextInt();
		int temp = num;
		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("reverse number " + reverse);
	}

}
