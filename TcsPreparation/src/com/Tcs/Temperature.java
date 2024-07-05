package com.Tcs;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Enter Faherinheat to Convert into Celcius");
		Scanner sc = new Scanner(System.in);
		int Fahrenheit = sc.nextInt();
		int Celsius;
		Celsius = ((Fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature in celsius is: " + Celsius);

	}

}
