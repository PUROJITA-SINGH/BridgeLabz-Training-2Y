import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter movie name, seat number, and ticket price:");
        String movieName = scanner.nextLine();
        String seatNumber = scanner.nextLine();
        double price = scanner.nextDouble();
        
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookTicket();
        ticket.displayDetails();
        scanner.close();
    }
}

class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;
    
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }
    
    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for seat " + seatNumber);
        } else {
            System.out.println("Ticket already booked!");
        }
    }
    
    public void displayDetails() {
        System.out.println("Ticket Details:");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: $" + String.format("%.2f", price));
        System.out.println("Status: " + (isBooked ? "Booked" : "Not Booked"));
    }
}
