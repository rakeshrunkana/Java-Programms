package com.Thiskeyword;

class Rectangle {
	int length;
	int breadth;

	Rectangle(int l, int b) {
		this.length = l;
		this.breadth = b;
	}

	void display() {
		System.out.println("Length :" + this.length);
		System.out.println("Breadth :" + this.breadth);
	}
}

public class ThisKeyword {

	public static void main(String[] args) {
		Rectangle rc = new Rectangle(10, 20);
		rc.display();
	}

}
