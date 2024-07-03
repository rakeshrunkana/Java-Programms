package com.TcsPreparation;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
