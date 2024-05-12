package com.ThisKeyWord;

public class ThisConstructor {
	int rollno;
	String name, course;
	float fee;

	public ThisConstructor(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	public ThisConstructor(int rollno, String name, String course, float fee) {
		this(rollno, name, course);
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}

	public static void main(String[] args) {
		ThisConstructor t1 = new ThisConstructor(111, "Ankit", "java");
		ThisConstructor t2 = new ThisConstructor(222, "Sumit", "Python", 6000f);
		t1.display();
		t2.display();
	}

}
