package com.Inheritance;

class Animal { // Single level Inheritance
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}

}

class Cat extends Animal {
	void meow() {
		System.out.println("Meowing...");
	} // Multi level Inheritance
}

public class Inheritance {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		c.eat();
		Dog d = new Dog();
		d.bark();
		d.eat();
	}

}