package com.Tcs;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		System.out.println("Enter two numbers ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("First Number is " + num1);
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Second Number is " + num2);
		System.out.println("Before Swapping " + num1 + num2);
		// Swapping Logic
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swapping " + num1 + num2);

	}

}
