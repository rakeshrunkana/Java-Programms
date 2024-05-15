package com.Student;

public class Student {
	private String name;
	private String college;

	public Student(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege(String name) {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public static void main(String[] args) {
		Student student = new Student("Rakesh", "Aditya Degree College");
		Student student1 = new Student("Prakash", "Gsyatri Vidya Prasid");
		Student student2 = new Student("Pramod", "IIT");
		System.out.println(student.name + " " + student.college);
		System.out.println(student1.name + " " + student1.college);
		System.out.println(student2.name + " " + student2.college);

	}

}
