package com.dto;

import java.time.LocalDate;

public class Booking {
	private String fromPlace;
    private String toPlace;
    private LocalDate journeyDate;
    private int numOfPassengers;
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public LocalDate getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(LocalDate journeyDate) {
		this.journeyDate = journeyDate;
	}
	public int getNumOfPassengers() {
		return numOfPassengers;
	}
	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}
	public Booking(String fromPlace, String toPlace, LocalDate journeyDate, int numOfPassengers) {
		super();
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.journeyDate = journeyDate;
		this.numOfPassengers = numOfPassengers;
	}
	public Booking() {
		super();
	}
    

}
