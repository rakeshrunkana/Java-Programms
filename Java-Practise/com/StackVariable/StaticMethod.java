package com.StackVariable;

public class StaticMethod {
	int rollno;
	String name;
	static String college = "ITS";

	static void chnage() {
		college = "BBDIT";
	}

	public StaticMethod(int r, String n) {
		rollno = r;
		name = n;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}

	public static void main(String[] args) {
		StaticMethod.chnage();
		StaticMethod s1 = new StaticMethod(111, "Karan");
		StaticMethod s2 = new StaticMethod(222, "Aryan");
		StaticMethod s3 = new StaticMethod(333, "Sonoo");
		s1.display();
		s2.display();
		s3.display();
	}

}
