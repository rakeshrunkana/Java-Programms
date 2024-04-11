package com.Constructor;

class Parent {
	public Parent() {
		System.out.println("Non-Param of Parent ");
	}

	Parent(int x) {
		System.out.println("Param of Parent " + x);
	}
}

class Child extends Parent {
	public Child() {
		System.out.println("Non-Param of Child  ");
	}

	Child(int y) {
		System.out.println("Param of Child ");
	}

	Child(int x, int y) {
		super(x);
		System.out.println("2 Param of Child " + y);
	}
}

class GrandChild extends Child {
	public GrandChild() {
		System.out.println("Grand Child Construtor ");
	}
}

public class InheritConstructor {

	public static void main(String[] args) {
		// GrandChild c = new GrandChild();
		Child c = new Child(10,20);
	}

}
