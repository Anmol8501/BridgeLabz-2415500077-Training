public class MovieTicket {
    // Private attributes
    private String movieName;
    private String seatNumber; // null if not yet booked
    private double price;      // 0.0 if not yet booked

    // Constructor: Creates a ticket request for a specific movie
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = null; // Explicitly set to null to show it's unbooked
        this.price = 0.0;
    }

    // Method to book the ticket (assigns seat and price)
    public void bookTicket(String seat, double cost) {
        this.seatNumber = seat;
        this.price = cost;
        System.out.println("Successfully booked ticket for: " + this.movieName);
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("--- Ticket Details ---");
        System.out.println("Movie: " + this.movieName);
        if (this.seatNumber == null) {
            System.out.println("Status: NOT YET BOOKED");
        } else {
            System.out.println("Seat: " + this.seatNumber);
            System.out.printf("Price: $%.2f\n", this.price);
        }
    }

    // --- Main method to test THIS class ---
    public static void main(String[] args) {
        // Create a ticket "request" for a movie
        MovieTicket ticket1 = new MovieTicket("Dune: Part Two");

        // Display details (should show not booked)
        ticket1.displayTicketDetails();
        System.out.println(); // Add space

        // Now, book the ticket
        ticket1.bookTicket("Row G, Seat 12", 18.50);
        System.out.println(); // Add space

        // Display details again (should show booked info)
        ticket1.displayTicketDetails();
    }
}