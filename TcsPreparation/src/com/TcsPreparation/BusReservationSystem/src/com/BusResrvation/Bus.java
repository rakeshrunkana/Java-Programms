package com.BusResrvation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bus {
	private int busId;
	private String busName;
	private int totalSeats;
	private int bookedSeats;
	private List<Date> schedule;

	public Bus(int busId, String busName, int totalSeats) {
		this.busId = busId;
		this.busName = busName;
		this.totalSeats = totalSeats;
		this.bookedSeats = 0;
		this.schedule = new ArrayList<>();
	}

	public int getBusId() {
		return busId;
	}

	public String getBusName() {
		return busName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public int getAvailableSeats() {
		return totalSeats - bookedSeats;
	}

	public boolean bookSeat() {
		if (bookedSeats < totalSeats) {
			bookedSeats++;
			return true;
		} else {
			return false;
		}
	}

	public boolean cancelSeat() {
		if (bookedSeats > 0) {
			bookedSeats--;
			return true;
		} else {
			return false;
		}
	}

	public List<Date> getSchedule() {
		return schedule;
	}

	public void addSchedule(Date date) {
		schedule.add(date);
	}
}
