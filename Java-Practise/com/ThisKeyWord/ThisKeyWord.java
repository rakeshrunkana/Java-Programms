package com.ThisKeyWord;

public class ThisKeyWord {
	int rollno;
	String name;
	float fee;

	public ThisKeyWord(int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}

	public static void main(String[] args) {
		ThisKeyWord td1 = new ThisKeyWord(111, "Ankit", 5000f);
		ThisKeyWord td2 = new ThisKeyWord(222, "Sumit", 6000f);
		td1.display();
		td2.display();
	}

}
