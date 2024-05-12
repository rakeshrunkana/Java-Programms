package com.Temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		System.out.println("Enter Temperature in Fahernhit");
		Scanner sc = new Scanner(System.in);
		float temperature;
		temperature = sc.nextFloat();
		temperature = ((temperature - 32) * 5 / 9);
		System.out.println("Temperature in Celcius " + temperature);
	}

}
