package com.BusResrvation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusReservationSystem {
	private List<Bus> buses;
	private List<Booking> bookings;

	public BusReservationSystem() {
		buses = new ArrayList<>();
		bookings = new ArrayList<>();
	}

	public void addBus(Bus bus) {
		buses.add(bus);
	}

	public Bus getBusById(int busId) {
		for (Bus bus : buses) {
			if (bus.getBusId() == busId) {
				return bus;
			}
		}
		return null;
	}

	public boolean bookSeat(int busId, Passenger passenger, Date travelDate, double payment) {
		Bus bus = getBusById(busId);
		if (bus != null && bus.bookSeat()) {
			Booking booking = new Booking(bus, passenger, bus.getTotalSeats() - bus.getAvailableSeats(), travelDate,
					payment);
			bookings.add(booking);
			return true;
		} else {
			return false;
		}
	}

	public boolean cancelBooking(int busId, Passenger passenger, Date travelDate) {
		for (Booking booking : bookings) {
			if (booking.getBus().getBusId() == busId && booking.getPassenger().getName().equals(passenger.getName())
					&& booking.getTravelDate().equals(travelDate)) {
				booking.getBus().cancelSeat();
				bookings.remove(booking);
				return true;
			}
		}
		return false;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public boolean rescheduleBooking(int busId, Passenger passenger, Date oldDate, Date newDate) {
		for (Booking booking : bookings) {
			if (booking.getBus().getBusId() == busId && booking.getPassenger().getName().equals(passenger.getName())
					&& booking.getTravelDate().equals(oldDate)) {
				booking.getTravelDate().setTime(newDate.getTime());
				return true;
			}
		}
		return false;
	}

	public void rescheduleBooking(Booking booking, Date newDate) {
		// TODO Auto-generated method stub
		
	}

	public void cancelBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public boolean bookSeat(int busId, Passenger passenger, Date date, Payment payment) {
		// TODO Auto-generated method stub
		return false;
	}
}
