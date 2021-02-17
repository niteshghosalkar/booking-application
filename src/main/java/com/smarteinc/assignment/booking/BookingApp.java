package com.smarteinc.assignment.booking;

public class BookingApp {

	public int bookingProcess(Ticket x) {
		BookingContext context = new BookingContext(TypeEnum.valueOfLabel(x.getType()).createObject());
		context.executeStrategy(x);

		// method should return the type of ticket booked
		return x.getType();
	}

}
