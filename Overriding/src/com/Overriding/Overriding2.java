package com.Overriding;

class Car {
	public void start() {
		System.out.println("Car Started ");
	}

	public void accelerate() {
		System.out.println("Car is Accelerated ");
	}

	public void changeGear() {
		System.out.println("Car Gear Change ");
	}

	class LuxaryCar extends Car {
		public void changeGear() {
			System.out.println("Automatic Gear ");
		}

		public void openRoof() {
			System.out.println("Sun Roof is Opened ");
		}
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.accelerate();
		c.changeGear();

	}
}
