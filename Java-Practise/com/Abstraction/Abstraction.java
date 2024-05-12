package com.Abstraction;

abstract class Bike {
	abstract void run(); //Abstraction
}

class Honda extends Bike {
	void run() {
		System.out.println("running safely");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Bike obj = new Honda();
		obj.run();

	}

}
