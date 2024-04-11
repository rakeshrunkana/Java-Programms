package com.Overloading;

class Super {
	public void display() {
		System.out.println("Super Display ");
	}
}

class Sub extends Super {
	@Override
	public void display() {
		System.out.println("Sub Display ");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Super s = new Sub();
		s.display();
	}

}
