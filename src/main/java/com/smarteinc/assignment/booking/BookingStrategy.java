package com.smarteinc.assignment.booking;

import java.util.Objects;

public interface BookingStrategy {

	default void validateAllFieldsPresent(Ticket ticket) {
		try {
			Objects.requireNonNull(ticket);
			Objects.requireNonNull(ticket.getStartDate());
			Objects.requireNonNull(ticket.getEndDate());
			Objects.requireNonNull(ticket.getFrom());
			Objects.requireNonNull(ticket.getDestination());
			Objects.requireNonNull(ticket.getPassenger());
		} catch (NullPointerException e) {
			throw e;
		}

	}

	default void sendTicketBookedMail(Ticket ticket) {
		// Assume email is sent to passenger that his/her ticket is booked
	}

	void doBooking(Ticket ticket);

}
