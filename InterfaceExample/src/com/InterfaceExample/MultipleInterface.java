package com.InterfaceExample;

interface Printable {
	void print(); //Multiple Inheritance
}

interface Showable {
	void show();
}

class A7 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		A7 obj = new A7();
		obj.print();
		obj.show();

	}

}
