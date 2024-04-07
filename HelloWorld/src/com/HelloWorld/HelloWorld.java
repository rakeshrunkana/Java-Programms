package com.HelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Enter Your Name ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Welocme " + str);
	}

}
