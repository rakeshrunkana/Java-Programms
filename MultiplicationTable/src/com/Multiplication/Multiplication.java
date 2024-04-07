package com.Multiplication;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("Enter a Number ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + number * i);

		}

	}

}
