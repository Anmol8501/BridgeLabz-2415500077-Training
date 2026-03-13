package Circular_Linked_List_Online_Ticket_Reservation_System;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n----- Ticket Reservation -----");
        TicketCLL tickets = new TicketCLL();
        tickets.add(1, "Amit", "Avengers", "A1", "10:00 AM");
        tickets.add(2, "Neha", "Avatar", "B2", "1:00 PM");
        tickets.remove(1);
        tickets.display();
        tickets.search("Neha", "Avatar");
        tickets.countTickets("Avatar");
    }
}
