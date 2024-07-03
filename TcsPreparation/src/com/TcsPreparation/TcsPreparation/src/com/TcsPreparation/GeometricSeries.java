package com.TcsPreparation;

import java.util.Scanner;

public class GeometricSeries {

	public static void main(String[] args) {
		System.out.println("Program to print Geometric ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a, r, n ");
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int term = a;
		for (int i = 0; i < n; i++) {
			System.out.println(term + " , ");
			term = term * r;
		}
	}

}
