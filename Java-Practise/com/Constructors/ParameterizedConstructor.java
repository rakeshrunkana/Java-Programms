package com.Constructors;

public class ParameterizedConstructor {
	int id;
	String name;

	public ParameterizedConstructor(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		ParameterizedConstructor p1 = new ParameterizedConstructor(111, "Rakesh");
		ParameterizedConstructor p2 = new ParameterizedConstructor(222, "Aryan");
		p1.display();
		p2.display();
	}

}
