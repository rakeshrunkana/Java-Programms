package com.BusResrvation;

import java.util.Date;

public class Booking {
	private static final double GST_RATE = 0.18;
	private Bus bus;
	private Passenger passenger;
	private int seatNumber;
	private Date travelDate;
	private double amount;
	private double gstAmount;

	public Booking(Bus bus, Passenger passenger, int seatNumber, Date travelDate, double payment) {
		this.bus = bus;
		this.passenger = passenger;
		this.seatNumber = seatNumber;
		this.travelDate = travelDate;
		this.amount = (double) payment;
		this.gstAmount = payment * GST_RATE;
	}

	
	public Bus getBus() {
		return bus;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public double getAmount() {
		return amount;
	}

	public double getGstAmount() {
		return gstAmount;
	}

	@Override
	public String toString() {
		return "Booking [Bus Name=" + bus.getBusName() + ", Passenger Name=" + passenger.getName() + ", Seat Number="
				+ seatNumber + ", Travel Date=" + travelDate + ", Amount=" + amount + ", GST=" + gstAmount + "]";
	}
}
