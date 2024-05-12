package com.Aggregation;

public class AggregationImplementation {
	int id;
	String name;
	Aggregation aggregation;

	public AggregationImplementation(int id, String name, Aggregation aggregation) {
		this.id = id;
		this.name = name;
		this.aggregation = aggregation;

	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(aggregation.city + " " + aggregation.state + " " + aggregation.country);
	}

	public static void main(String[] args) {
		Aggregation aggregation1 = new Aggregation("gzb", "up", "india");
		Aggregation aggregation2 = new Aggregation("gno", "up", "india");

		AggregationImplementation a1 = new AggregationImplementation(111, "varun", aggregation1);
		AggregationImplementation a2 = new AggregationImplementation(112, "arun", aggregation2);
		a1.display();
		a2.display();
	}

}
