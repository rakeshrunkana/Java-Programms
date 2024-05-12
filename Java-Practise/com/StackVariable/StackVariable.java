package com.StackVariable;


public class StackVariable {
	int rollno;
	String name;
	static String college = "ITS";

	public StackVariable(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String[] args) {
		StackVariable s1 = new StackVariable(111, "Karan");
		StackVariable s2 = new StackVariable(222, "Aryan");
		s1.display();
		s2.display();
	}

}
