package com.BusResrvation;

public class Payment {
	private double amount;
	private double gst;

	public Payment(double amount, double gst) {
		this.amount = amount;
		this.gst = gst;
	}

	public double getTotalAmount() {
		return amount + gst;
	}
}
