package com.Abstraction;

abstract class Employee {
	private String name;
	private int paymentPerHour;

	public Employee(String name, int paymentPerHour) {
		this.name = name;
		this.paymentPerHour = paymentPerHour;
	}

	public abstract int calculateSalary();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayementPerHour() {
		return paymentPerHour;
	}

	public void setPayementPerHour(int paymentPerHour) {
		this.paymentPerHour = paymentPerHour;
	}
}

class Contractor extends Employee {
	private int workingHours;

	public Contractor(String name, int paymentPerHour, int workingHours) {
		super(name, paymentPerHour);
		this.workingHours = workingHours;
	}

	@Override
	public int calculateSalary() {
		return getPayementPerHour() * workingHours;
	}
}

class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int paymentPerHour) {
		super(name, paymentPerHour);
	}

	@Override
	public int calculateSalary() {
		return getPayementPerHour() * 8;
	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Employee contractor = new Contractor("contractor", 10, 10);
		Employee fulltimeEmployee = new FullTimeEmployee("full time employee", 8);
		System.out.println( contractor.calculateSalary());
		System.out.println(fulltimeEmployee.calculateSalary());

	}

}
