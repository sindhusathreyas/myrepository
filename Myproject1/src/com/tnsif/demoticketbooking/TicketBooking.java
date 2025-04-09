package com.tnsif.demoticketbooking;

public class TicketBooking {
	public static void main(String[] args) {
        TicketManager manager = new TicketManager();

        // Display initial ticket count
        manager.displayTickets();

        // Assuming 5 people booking tickets
        System.out.println("Booking tickets...");

        manager.bookTicket(); // Person 1
        manager.bookTicket(); // Person 2
        manager.bookTicket(); // Person 3
        manager.bookTicket(); // Person 4
        manager.bookTicket(); // Person 5

        // Display remaining tickets
        manager.displayTickets();
    }
}	


