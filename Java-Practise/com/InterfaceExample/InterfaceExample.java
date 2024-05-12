package com.InterfaceExample;

interface printable {
	void print(); // Interface Example
}

class A6 implements printable {
	public void print() {
		System.out.println("Hello");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		A6 obj = new A6();
		obj.print();

	}

}
