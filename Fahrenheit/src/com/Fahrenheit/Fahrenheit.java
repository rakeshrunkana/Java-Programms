package com.Fahrenheit;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		System.out.println("Enter temperature in Fahrenheit ");
		Scanner sc = new Scanner(System.in);
		float temperature;
		temperature = sc.nextFloat();
		temperature = ((temperature - 32) * 5 / 9);
		System.out.println("Temperature in Celsius " + temperature);
	}

}
