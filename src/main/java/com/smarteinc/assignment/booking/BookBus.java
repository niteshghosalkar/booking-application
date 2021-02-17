package com.smarteinc.assignment.booking;

public class BookBus implements BookingStrategy {

	@Override
	public void doBooking(Ticket ticket) {
		// TODO Auto-generated method stub
		validateAllFieldsPresent(ticket);
		bookedTicket(ticket);
		sendTicketBookedMail(ticket);		
	}
	
	private void bookedTicket(Ticket x) {
		// assume Bus is booked by making some entries in db
	}

}
