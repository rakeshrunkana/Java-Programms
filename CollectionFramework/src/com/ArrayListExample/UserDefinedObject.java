package com.ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;

	}
}
public class UserDefinedObject {

	public static void main(String[] args) {
		// Creating user-defined class objects
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
		// Creating arraylist
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);// Adding Student class object
		al.add(s2);
		al.add(s3);
		// Getting Iterator
		Iterator<Student> itr = al.iterator();
		// Traversing elements of ArrayList Object
		Student st = (Student) itr.next();
		System.out.println(st.rollno + " " + st.name + " " + st.age);
	}

}
