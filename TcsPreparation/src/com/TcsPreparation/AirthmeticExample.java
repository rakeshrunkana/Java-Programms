package com.TcsPreparation;

import java.util.Scanner;

public class AirthmeticExample {

	public static void main(String[] args) {
		System.out.println("Program to print Arithmetic Series");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a , d, n ");
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int term = a;
		for (int i = 0; i < n; i++) {
			System.out.println(term + " ,");
			term = term + d;
		}
	}

}
