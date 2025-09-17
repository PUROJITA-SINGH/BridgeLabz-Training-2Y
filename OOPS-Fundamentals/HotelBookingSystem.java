import java.util.Scanner;

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter guest name, room type, and number of nights:");
        String guestName = scanner.nextLine();
        String roomType = scanner.nextLine();
        int nights = scanner.nextInt();
        
        // Using parameterized constructor
        HotelBooking booking1 = new HotelBooking(guestName, roomType, nights);
        booking1.displayBookingDetails();
        
        // Using default constructor
        HotelBooking booking2 = new HotelBooking();
        booking2.displayBookingDetails();
        
        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking1);
        booking3.displayBookingDetails();
        
        scanner.close();
    }
}

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;
    
    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }
    
    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    
    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    
    public void displayBookingDetails() {
        System.out.println("Booking Details:");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println();
    }
}
