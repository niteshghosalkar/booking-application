package com.smarteinc.assignment.booking;

public class BookingContext {
	private BookingStrategy strategy;

	public BookingContext(BookingStrategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy(Ticket ticket) {
		strategy.doBooking(ticket);
	}
}
